package com.gewara.api.merchant.service;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

import com.gewara.api.merchant.vo.EverydayMpiReportVo;
import com.gewara.api.merchant.vo.GoodsSummaryReportTotalVo;
import com.gewara.api.merchant.vo.MovieCityBoughtReportVo;
import com.gewara.api.merchant.vo.MovieSellerTotalVo;
import com.gewara.api.merchant.vo.RefundOrderTotalVo;
import com.gewara.api.vo.ResultCode;

public interface MerchantReportService {
	/**
	 * ӰƱ����ͳ��
	 * 
	 * @param cinemaIds
	 *            ���ӰԺid ��,�ָ�
	 * @param movieId
	 *            ��Ӱid����Ϊ��
	 * @param timeType
	 *            ��ӳʱ�䣬�����µ�ʱ�� addtime Ϊ�µ�ʱ�� ���򰴷�ӳʱ��
	 * @param startTime
	 *            ͳ�ƵĿ�ʼʱ��
	 * @param endTime
	 *            ͳ�ƵĽ���ʱ��
	 * @param from
	 *            ������ʹ��λ��
	 * @param maxnum
	 *            һҳ����
	 * @return
	 */
	ResultCode<MovieSellerTotalVo> movieSellStatistics(String cinemaIds, Long movieId, String timeType,
			Timestamp startTime, Timestamp endTime, int from, int maxnum);

	/**
	 * ����ӰԺ����ͳ��
	 * 
	 * @param cinemaId
	 * @param movieId
	 *            ��Ϊ��
	 * @param timeType
	 *            ��ӳʱ�䣬�����µ�ʱ�� addtime Ϊ�µ�ʱ�� ���򰴷�ӳʱ��
	 * @param opentype
	 *            ��������
	 * @param startTime
	 * @param endTime
	 * @return
	 */
	ResultCode<MovieSellerTotalVo> movieSellStatistics(long cinemaId, Long movieId, String timeType, String opentype,
			Timestamp startTime, Timestamp endTime, String edition, int from, int maxnum);

	ResultCode<MovieSellerTotalVo> movieSellStatistics(long cinemaId, Long movieId, String timeType, String opentype,
			Timestamp startTime, Timestamp endTime, int from, int maxnum);

	/**
	 * �˿��
	 * 
	 * @param cinemaIds
	 *            ӰԺid�����, �ŷָ�
	 * @param movieId
	 *            ����Ϊ��
	 * @param timeType
	 *            ֵΪaddtimeʱ���Ǹ����µ�ʱ�䣬 playtimeʱ���Ǹ�������ʱ��
	 * @param startTime
	 * @param endTime
	 * @param from
	 * @param maxnum
	 * @return
	 */
	ResultCode<RefundOrderTotalVo> refundReport(String cinemaIds, Long movieId, String timeType, Timestamp startTime,
			Timestamp endTime, int from, int maxnum);

	/**
	 * ӰԺ������Ʊ����
	 * 
	 * @param cinemaId
	 *            ��Ϊ��
	 * @param movieId
	 * @param timeType
	 * @param startTime
	 * @param endTime
	 * @param from
	 * @param maxnum
	 * @return
	 */
	ResultCode<RefundOrderTotalVo> refundOrderByCinema(long cinemaId, Long movieId, String timeType,
			Timestamp startTime, Timestamp endTime, int from, int maxnum);

	/**
	 * 
	 * @param cinemaIds
	 *            ���ӰԺid ��,�ָ�
	 * @param timetype
	 *            �µ�ʱ�� addtime Ϊ�µ�ʱ�� ��������ʱ��
	 * @param startTime
	 *            ��ʼʱ��
	 * @param endTime
	 *            ����ʱ��
	 * @param from
	 * @param maxnum
	 * @return
	 */
	ResultCode<GoodsSummaryReportTotalVo> goodsSummaryReport(String cinemaIds, String timetype, Timestamp startTime,
			Timestamp endTime, int from, int maxnum);

	/**
	 * ��ϸ�ײͱ���
	 * 
	 * @param cinemaId
	 *            ӰԺid
	 * @param timetype
	 *            �µ�ʱ�� addtime Ϊ�µ�ʱ�� ��������ʱ��
	 * @param startTime
	 *            ��ʼʱ��
	 * @param endTime
	 *            ����ʱ��
	 * @param from
	 * @param maxnum
	 * @return
	 */
	ResultCode<GoodsSummaryReportTotalVo> goodsSummaryReportByCinema(long cinemaId, String timetype,
			Timestamp startTime, Timestamp endTime, int from, int maxnum);

	/**
	 * ͳ��ÿ�����Ƭ��Ϣ
	 * 
	 * @param playDate
	 *            ��ѯ���� ��ֵΪ����Ŀ�ʼʱ�� ���� 2013-09-25 00:00:00
	 * @return
	 */
	ResultCode<EverydayMpiReportVo> mpiReportByPlayDate(Date playDate);

	/**
	 * ʱ����ڵ�Ӱ�ھ�����еĹ�Ʊ��
	 * 
	 * @param startTime
	 *            ��ѯ��ʼʱ�� ���� 2013-09-27 13:00:00 ��ѯʱ�� >= startTime��
	 * @param endTime
	 *            ��ѯ����ʱ�� ���� 2013-09-27 14:00:00 ��ѯʱ��< endTime ��
	 * @return
	 */
	ResultCode<List<MovieCityBoughtReportVo>> movieCityBoughtReport(Timestamp startTime, Timestamp endTime);

	/**
	 * ���ӰԺ����
	 * 
	 * @param num
	 *            ���id
	 * @param cinemaId
	 *            ӰԺid
	 * @param title
	 *            ����
	 * @param content
	 *            ����
	 * @param publishUser
	 *            �������ǳ�
	 * @return
	 */
	ResultCode addCinemaNotify(String num, Long cinemaId, String title, String content, String publishUser);
}
