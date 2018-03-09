package com.sample.redis.service;

import java.io.Serializable;
import java.util.concurrent.TimeUnit;

/**
 * @author szl
 *
 */
public interface IRedisService {

	/**
	 * get object form redis by key
	 * 
	 * @param key
	 * @return
	 */
	public Object getObject(String key);

	/**
	 * get class by key
	 * 
	 * @param key
	 * @param requiredType
	 * @return
	 */
	public <T> T get(String key, Class<? extends Serializable> requiredType);
	
	/**
	 * remove key
	 * 
	 * @param key
	 * @return
	 */
	public boolean remove(String key);

	/**
	 * @param key
	 * @param object
	 * @return
	 */
	public void saveObject(String key, Serializable object);

	/**
	 * @param key
	 * @param object
	 * @param timeout
	 * @param unit
	 * @return
	 */
	public void saveWithExpireTime(String key, Serializable object, long timeout, TimeUnit unit);

	/**
	 * @param key
	 * @return
	 */
	public boolean hasKey(String key);
	
	// /**
	// * @param key
	// * @return
	// */
	// public Map<String, String> getRedisMap(String key);
	//
	// /**
	// * @param key
	// * @param map
	// */
	// public void saveRedisMap(String key, Map<String, String> map);
	//
	// public void saveRedisMap(String key, String fieid, String value);
	//
	// public List<? extends Serializable> getObjectList(String key);
	//
	// public void saveObjectList(String key, List<? extends Serializable>
	// list);
	//
	// public void removeRedisList(String key);
	//
	// public void saveRedisList(String key, List<? extends Serializable> list);
	//
	// public List<String> getRedisList(String key);
	//
	// /**
	// * 删除所有的key
	// */
	// public void delete(Serializable key);
	// /**
	// * @param keys
	// */
	// public void delete(Collection<Serializable> keys);
	//
	// /**
	// * @param serializable
	// * @param values
	// * @return
	// */
	// public Long addToSet(Serializable serializable, Serializable... values);
	//
	// /**
	// * @param key
	// * @param values
	// * @return
	// */
	// public Long removeFromSet(Serializable key, Serializable... values);
	//
	// /**
	// * @param key
	// * @return
	// */
	// public Set<Serializable> getSet(Serializable key);
	//
	// /**
	// * @param key
	// * @return
	// */
	// public Set<Object> hashKeys(Serializable key);
	//
	// /**
	// * @param key
	// * @return
	// */
	// public List<Object> hashVals(Serializable key);
	//
	// /**
	// * @param key
	// * @param hashkey
	// * @param val
	// */
	// public void hashPut(Serializable key, Serializable hashkey, Serializable
	// val);
	//
	// /**
	// * @param key
	// * @param map
	// */
	// public void hashPutAll(Serializable key, Map<? extends Serializable, ?
	// extends Serializable> map);
	//
	// /**
	// * @param key
	// * @param hashkey
	// * @param val
	// */
	// public void hashPutIfAbsent(Serializable key, Serializable hashkey,
	// Serializable val);
	//
	// /**
	// * @param key
	// * @param hashkey
	// * @return
	// */
	// public Boolean hashExistKey(Serializable key, Serializable hashkey);
	//
	// /**
	// * @param key
	// * @param hashkey
	// * @return
	// */
	// public Object hashGet(Serializable key, Serializable hashkey);
	//
	// /**
	// * @param key
	// * @return
	// */
	// public Map<Object, Object> hashEntries(Serializable key);
	//
	// /**
	// * @param key
	// * @param hashkey
	// */
	// public void hashDelete(Serializable key, Serializable hashkey);
	//
	// /**
	// * @param key
	// * @param hashKeys
	// */
	// public void hashDelete(Serializable key, Serializable... hashKeys);
	//
	// /**
	// * @param key
	// * @param set
	// */
	// public void saveObjToSet(String key, Set<String> set);
	//
	// /**
	// * @param pattern
	// * @return
	// */
	// public Set<Serializable> getKeys(String pattern);
}
