package com.gewara.api.sns.constant;

import java.util.Arrays;
import java.util.List;


public class TagConstant {
	public static final String TAG_TOPIC = "topic";					//��ͨ�޹�������
	public static final String TAG_DIARY = "diary";					//����_����
	public static final String TAG_DIARY_MEMBER = "member_diary";
	public static final String TAG_QA = "qa";						//QA_����
	public static final String TAG_QA_MEMBER = "member_qa";			//�û�֪��
	public static final String TAG_VIDEO = "video";					//�ϴ���Ƶ����
	public static final String TAG_PICTURE = "picture";				//�ϴ�ͼƬ����
	public static final String TAG_MOVIE = "movie";
	public static final String TAG_MOVIE_DOWN= "movie_down"; 		//��Ӱ��ӳ
	public static final String TAG_MOVIE_RELEASE= "movie_release"; 	//��Ӱ��ӳ
	public static final String TAG_MOVIE_COMMENT= "movie_comment";
	public static final String TAG_CINEMA = "cinema";               //��ӰԺ
	public static final String TAG_STAR = "star";                   //Ӱ��
	public static final String TAG_STAR_DETAIL="starDetail";        //Ӱ������ҳTag
	public static final String TAG_DRAMA = "drama";					//����
	public static final String TAG_DRAMASTAR = "dramastar";			//���š����ݡ�����
	public static final String TAG_AGENCY = "agency";				//������ѵ
	public static final String TAG_CINEMA_ACTIVITY = "cinema_activity";				//ӰԺ�
	public static final String TAG_THEATRE_ACTIVITY = "theatre_activity";			//��Ժ�
	public static final String TAG_THEATRE = "theatre";         		//��Ժ
	public static final String TAG_ACTIVITY = "activity";				//�
	public static final String TAG_ACTIVITY_MEMBER = "member_activity";	//�
	public static final String TAG_PICTURE_MEMBER = "member_picture";	//����Ա��ͼƬ
	public static final String TAG_MEMBERPICTURE_MEMBER = "member_memberpicture";	//�û���ͼƬ
	public static final String TAG_CONACTIVITY = "conllectactivity";	//��ע�
	public static final Integer MULTIPLE_EXPVALUE= 10000;//��;���ֵ����
	public static final Integer EXPVALUE_TO_POINT = 1000;//����ֵת���ɻ���
	public static final String TAG_QUESTION = "gewaquestion";						//	����
	public static final String TAG_COMMU_MEMBER = "member_commu";						//	�û�Ȧ��
	public static final String TAG_COMMENT = "member_comment";						//	����
	public static final String TAG_COMMU_ACTIVITY = "commu_activity"; //Ȧ�ӻ
	public static final String TAG_COMMU = "commu"; //Ȧ��
	public static final String TAG_MEMBER_CINEMA = "member_cinema";						//�û�����ӰԺ����
	public static final String TAG_MEMBER_THEATRE = "member_theatre";						//�û����۾�Ժ����
	public static final String TAG_POINT = "everyPoint";//ÿ�պ��
	
	public static final String TAG_MEMBERCARD = "membercard";	
	
	public static final String TAG_COMMENT_TYPE = "comment";				//����
	public static final String TAG_MODERATOR_TYPE = "moderator";			//����
	
	public static final String TAG_BIGLABEL="biglabel";        //��ǩ��������	
	// ��������
	public static final String TAG_EDU = "edu";
	// ��������
	public static final String TAG_JOB = "job";
	//�ʺ���Ⱥ
	public static final String TAG_CROWD = "crowd";
	
	public static final List<String> TAGList = Arrays.asList(new String[]{"cinema", "movie", "theatre", "drama", "dramastar", "agency"});
	public static final String FLAG_PIC = "pic";
	public static final String FLAG_VIDEO = "video";

	public static final Integer READ_YES = 1;
	public static final Integer READ_NO = 0;
	public static final Integer READ_STATUS_ALL = -1;
	public static final String STATUS_FDEL = "fdel";
	public static final String STATUS_TDEL = "tdel";
	public static final String STATUS_TOALL = "toall";//����Ա����ȫվ�û�������(��δʹ��)
	public static final Long ADMIN_FROMMEMBERID = 0L;	// ����Ա���͸�ȫվ�û�, ���ù���ԱIDΪ   0
	public static final Long ADMIN_TOMEMBERID = 0L;	// ����Ա���͸�ȫվ�û�, ����ȫվ�û�IDΪ 0
	
	public static final String DEFAULT_SUBJECT = "վ����";
	public static final Integer MAX_SECOND = 20; //������ʱ��������ֹˢ��
	
	public static final String DATETYPE_LASTWEEK = "lastweek";//����
	public static final String DATETYPE_THISWEEK = "thisweek";//����
	public static final String DATETYPE_NEXTWEEK = "nextweek";//����
	
	public static final String LAST_WEEK_DIR = "lastweekdir";
	public static final String NEXT_WEEK_DIR = "nextweekdir";
	
	public static final String AGENDA_ACTION_TICKET = "ticket";						//���ӰƱ��������
	public static final String AGENDA_ACTION_DRAMA = "drama";						//�򻰾�Ʊ��������
	public static final String AGENDA_ACTION_AGENDA = "agenda";						//�Լ���������
	public static final String AGENDA_ACTION_JOIN_ACTIVITY = "joinactivity";		//�μӻ��������
	public static final String AGENDA_ACTION_CREATE_ACTIVITY = "createactivity";	//�������������
	public static final String AGENDA_ACTION_CREATE_RESERVE = "createreserve";		//����Լս��������
	public static final String AGENDA_ACTION_JOIN_RESERVE = "joinreserve";			//�μ�Լս��������
	public static final String AGENDA_ACTION_PUBSALE="pubsale";//����
	public static final String AGENDA_ACTION_PRICE5="price5";//5Ԫ��Ʊ
	
	
	public static final String RIGHTS_ALBUM_PUBLIC = "album_public";
	public static final String RIGHTS_ALBUM_FRIEND = "album_friend";
	public static final String RIGHTS_ALBUM_PRIVATE = "album_private";
	public static final String ALBUM_PUBLIC = "public";
	public static final String ALBUM_PRIVATE = "private";
	public static final String ALBUM_FRIEND = "friend";
	
	public static final String TAG_DRAMAORDER = "dramaOrder"; //�ݳ���Ʊ
	public static final String TAG_MOVIEORDER = "movieOrder"; //��Ӱ��Ʊ
	public static final String TAG_JOINACTIVITY = "joinActivity";//����ԤԼ�μӻ
	public static final String TAG_ACTIVITYORDER = "activityOrder"; //��շ�
	public static final String TAG_ZHUANTI = "zhuanti";

	public static final String TAG_AGENDA = "agenda";
	public static final String TAG_MOVIEAGENDA_MEMBER = "member_movieagenda"; //��Ӱ�����
	public static final String TAG_DRAMAAGENDA_MEMBER = "member_dramaagenda"; //���������
	public static final String TAG_AGENDA_MEMBER = "member_agenda";//�û������
	public static final String TAG_SUBJECTACTIVITY = "subjectActivity"; 	//�ר��
	
	public static final String SUBJECT_CHRISTMAS="christmas";
	
	public static final String SQUARE_MODEL="square_model";//�㳡ģ��
	//APP�㳡�Ƽ�����
	public static final String SQUARE_RECOMMENDED="square_recommended";//APP�㳡�Ƽ�����
	//�Ƽ���V�û�
	public static final String RECOMMENDED_USERS="recommended_users";//�Ƽ���V�û�
	
	// �Ƽ�
	public static final String RECOMMENDED_BATCHTYPE_FRIEND = "friend";// ��ӰȦ�Ƽ�
	public static final String RECOMMENDED_BATCHTYPE_SQUARE = "square";// �㳡�Ƽ�
	//app������ҳ�Ƽ�����
	public static final String RECOMMENDED_PERSON="recommended_person";//app������ҳ�Ƽ�����  
	//app������ҳ����ͼƬ
	public static final String RECOMMENDED_BACKGROUND="recommended_background";//app������ҳ����ͼƬ
	//app�������Ķ�̬�ڵ�
	public static final String RECOMMENDED_DYNAMIC = "recommended_dynamic";	//app�������Ķ�̬�ڵ�
	//app�������ĸ���ϲ��
	public static final String RECOMMENDED_FANCY = "recommended_fancy";	//app�������ĸ���ϲ��
	public static final String RECOMMENDED_SHORTWALA = "recommended_shortWala";	//app7.0�Ƽ�����(������)
	public static final String RECOMMENDED_LONGWALA = "recommended_longWala";	//app7.0�Ƽ�����(������)
}
