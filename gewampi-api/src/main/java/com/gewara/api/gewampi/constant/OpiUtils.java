/*** Eclipse Class Decompiler plugin, copyright (c) 2016 Chen Chao (cnfree2000@hotmail.com) ***/
package com.gewara.api.gewampi.constant;

import com.gewara.api.gewampi.vo.MovieItemVo;
import com.gewara.util.DateUtil;
import com.gewara.util.StringUtil;
import java.sql.Timestamp;

public class OpiUtils {
	public static String getStatusStr(MovieItemVo opi) {
		if (!opi.hasOpenid()) {
			return "������δ���Ź�Ʊ";
		} else {
			Timestamp curtime = new Timestamp(System.currentTimeMillis());
			if (opi.getPlaytime().before(curtime)) {
				return "�������Ѿ���ʱ";
			} else {
				String time = DateUtil.format(curtime, "HHmm");
				boolean open = opi.getOpentime().before(curtime) && opi.getClosetime().after(curtime)
						&& opi.getStatus().equals("Y") && StringUtil.between(time, opi.getDayotime(), opi.getDayctime())
						&& opi.getGsellnum().intValue() < opi.getAsellnum().intValue();
				return open ? "��Ʊ��"
						: (!opi.getStatus().equals("Y") ? "�������ݲ����Ŷ�Ʊ"
								: (opi.getOpentime().after(curtime)
										? "������" + DateUtil.formatTimestamp(opi.getOpentime()) + "���Ŷ�Ʊ"
										: (opi.getClosetime().before(curtime) ? "�������ѹرն�Ʊ"
												: (opi.getGsellnum().intValue() >= opi.getAsellnum().intValue()
														? "��������λ������"
														: (!StringUtil.between(time, opi.getDayotime(),
																opi.getDayctime())
																		? "������ֻ��ÿ��"
																				+ opi.getDayotime().substring(0, 2)
																				+ ":"
																				+ opi.getDayotime().substring(2, 4)
																				+ "~"
																				+ opi.getDayctime().substring(0, 2)
																				+ ":"
																				+ opi.getDayctime().substring(2, 4)
																				+ "����"
																		: "δ֪")))));
			}
		}
	}
}