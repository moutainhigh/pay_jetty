package com.ibs.common.module.frameworkimpl.redis.cache.entry;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.exceptions.JedisException;


public abstract class TtlEntryCache<E> extends BaseEntryCache<E> implements IEntryCache<E> {
	
	public E get(String key) {
		
		E obj = null;

		if (key == null)
			return obj;

		Jedis jedis = null;
		
		try {
			jedis = this.openJedis();
			
			// get cache data
			String entryKey = this.getCacheKey(key);
			String value = jedis.get(entryKey);
			
			if (value == null) {	// cache not exists
				obj = this.getData(key);
				value = this.serialize(obj);
				jedis.setex(entryKey, this.getTtl(), value);
				logger.trace("key:[" + entryKey + "] ,get data from database: " + value);
			} else {
				obj = this.deserialize(value);
				logger.trace("key:[" + entryKey + "] ,get data from cache: " + value);
			}
		} catch (JedisException e) {
			logger.error(e.getMessage(), e);
			obj = this.getData(key);
		} catch (RuntimeException t) {
			throw t;
		} finally {
			this.closeJedis(jedis);
		}

		return obj;
	}

	
}
