package com.gewara.drama.admin.dubbo.theatre;

import java.util.List;

import com.gewara.api.vo.RequestParamVo;
import com.gewara.api.vo.ResultCode;
import com.gewara.drama.vo.TheatreRoomSeatVo;
import com.gewara.drama.vo.TheatreRoomVo;
/**
 * ����������λ����(��̨)
 * @author john
 *
 */
public interface TheatreRoomSeatAdminVoService {

	/**
	 * ͨ�������ѯ������λ��Ϣ
	 * @param roomid
	 * @return
	 */
	ResultCode<List<TheatreRoomSeatVo>> getTheatreRoomSeatList(Long roomid);

	/**
	 * ��������һ��
	 * @param roomId
	 * @return
	 */
	ResultCode<TheatreRoomVo> addRowSeat(Long roomId);

	/**
	 * ��������һ��
	 * @param roomId
	 * @return
	 */
	ResultCode<TheatreRoomVo> addRankSeat(Long roomId);

	/**
	 * ����ɾ��һ��
	 * @param roomId
	 * @return
	 */
	ResultCode<Boolean> deleteRankSeatByRoomid(Long roomId);

	/**
	 * ����ɾ��һ��
	 * @param roomId
	 * @return
	 */
	ResultCode<Boolean> deleteRowSeatByRoomid(Long roomId);

	/**
	 * ͨ������ID����λ���������ѯ��λ
	 * @param roomid
	 * @param lineno
	 * @param rankno
	 * @return
	 */
	ResultCode<TheatreRoomSeatVo> getTheatreRoomSeatByPosition(Long roomid, int lineno, int rankno);

	/**
	 * ͨ������ID�����������кŸ�����λ�к�
	 * @param roomid
	 * @param lineno
	 * @param seatline
	 * @return
	 */
	ResultCode<Boolean> updateSeatlineByRoomSeatLineno(Long roomid, int lineno, String seatline);

	/**
	 * 
	 * ͨ������ID�����������кŸ�����λ�к�
	 * @param roomid
	 * @param rankno
	 * @param seatrank
	 * @return
	 */
	ResultCode<Boolean> updateSeatrankByRoomSeatRankno(Long roomid, int rankno, String seatrank);

	/**
	 * ͨ������ID����������λ
	 * @param roomid
	 * @param linelist
	 * @param ranklist
	 * @param userid
	 * @return
	 */
	ResultCode batchAddTheatreRoomSeat(Long roomid, String linelist, String ranklist);

	/**
	 * ͨ������ID����ɾ����λ
	 * @param roomid
	 * @param linelist
	 * @param ranklist
	 * @param userid
	 * @return
	 */
	ResultCode batchDeleteTheatreRoomSeat(Long roomid, String linelist, String ranklist);

	/**
	 * ͨ����λID������λ״̬
	 * @param seatid
	 * @param initstatus
	 * @return
	 */
	ResultCode updateTheatreRoomSeatInitStatus(Long seatid, String initstatus);

	/**
	 * ͨ����λID����������
	 * @param seatid
	 * @param loveInd
	 * @return
	 */
	ResultCode updateTheatreRoomSeatLoveInd(Long seatid, String loveInd);

	/**
	 * ��ȡ����������λͼ���ַ������������á�@@���ָ������á�,���ָ�
	 * @param roomid
	 * @return
	 */
	ResultCode<TheatreRoomVo> updateTheatreRoomSeatMapStr(Long roomid);
	
	/**
	 * ��ȡTheatreRoomVo
	 * @param id
	 * @return
	 */
	ResultCode<TheatreRoomVo> getTheatreRoomById(Long id);
	
	/**
	 * ���TheatreRoom
	 * @param RequestParamVo
	 * @return
	 */
	ResultCode addBaseSeat(RequestParamVo paramVo);

	/**
	 * ���TheatreRoom
	 * @param RequestParamVo
	 * @return
	 */
	ResultCode clearBaseSeat(RequestParamVo paramVo);

	/**
	 * ����RankNo
	 * @param RequestParamVo
	 * @return
	 */
	ResultCode updateBaseSeatRankNo(RequestParamVo paramVo);

}
