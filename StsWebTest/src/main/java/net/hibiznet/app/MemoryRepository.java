package net.hibiznet.app;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MemoryRepository {
	private static Map<Long, Map<String,Object>> store = new HashMap<Long,Map<String,Object>>();
	private static long sequence = 0L;

	private static final MemoryRepository instance = new MemoryRepository();

	public static MemoryRepository getInstance() {
		return instance;
	}

	private MemoryRepository() {
	}
	
	
	public Map<String,Object> save(Map<String,Object> param) {
		param.put("id",++sequence);
		store.put((Long)param.get("id"), param);
		return param;
	}
	
	public Map<String,Object> findById(Long id) {
		return store.get(id);
	}
	
	public List<Map<String,Object>> findAll(){
		return new ArrayList<>(store.values());
	}
	
	public void clearStore() {
		store.clear();
	}
}
