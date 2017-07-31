package com.gewara.job;

import java.sql.Timestamp;
import java.util.List;
import java.util.Map;

public interface JobStatsService {
	/**
	 * ��ȡ��ʱ����ͳ����Ϣ
	 * @param from
	 * @param to
	 * @return List<Map(jobname,status,execCount)>
	 */
	List<Map<String, Object>> getJobStatsList(Timestamp from, Timestamp to);
	Map<String, String> getJobConfig();
}
