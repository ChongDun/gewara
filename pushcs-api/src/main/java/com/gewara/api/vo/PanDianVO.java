package com.gewara.api.vo;

import java.io.Serializable;

/***
 * �̵�Model����
 */
public class PanDianVO implements Serializable{
	private static final long serialVersionUID = 142345234562634L;
	private Long memberid; //�û�id
    //page1
    private String nickName; //�û��ǳ�
    private Integer registerDuration; //ע��ʱ��
    //page2
    private Integer watchedMovieNum;//������Ӱ��
    private Integer dayNum; //���쿴�ĵ�Ӱ��
    private Integer nightNum;//���Ͽ��ĵ�Ӱ��
    private String repeatMovies; //�ۿ����ظ���Ӱ�б�
    private Integer movieCost;//����Ӱʵ�ʻ���
    private Integer saveMoney;//��ʡ����
    //page3
    private Long mostCinema;//��ȥӰԺid
    private Integer cinemaMovieNum;//���õ�Ӱ��
    private Integer cinemaUserCount;//��ӰԺ��Ӱ���˴�
    private String  userMeetList;//����Щ�û��������
    //page4
    private Integer maxTogetherNum; //�������
    private Integer aloneNum; //һ���˹ۿ�����
    //page5
    private Integer totalMarkNum;//��ִ���
    private Integer leFiveNum; //С�ڵ���5�ֵĴ���
    private Integer geEightNum;  //���ڵ���8�ֵĴ���
    private Integer greatMovieNum;  //�˲����Ӱ��
    private String goodMovieIds; //  5����Ӱlogo��id�� ���ơ��Լ�������
    private String badMovieIds;  //5��ŭ���Ӱlogo��id�� ���ơ��Լ�������
    private String markMovieIds ; //����ֵĵ�Ӱ.
    //page6
    private Integer totalOrdersNum; //һ���ܶ�����
    private Integer walaCount;  //д������
    private String ticketWalaCount; //��Ʊ����wala ����
    private Integer beFloweredCount;    //������������
    private Integer beReplyedCount; //�������ظ�����
    private Long bestWalaID;    //������ۻ�����������һ������
    //page7
    private Long bestMovieId; //������������ߵĵ�Ӱ
    private Long recommendWalaID; //���ۻ�������һ��wala
    private Integer flowerCount;//��������
    private Integer replyCount;//�ظ�����
    private Integer friendCount; //����ͨѶ¼�ҵ��ĺ�������
    //page8
    private Integer redPacketsNum;//��ȡÿ�պ���Ĵ���
    private Integer totalAnswerNum;//ÿ�մ���Ĵ���
    private Integer rightAnswerNum;//��Դ���
    private Integer wrongAnswerNum;//������
    private Integer joinActivityNum;//�μӻ�Ĵ���
    private String honorLabel;//������ǩ

    public PanDianVO() {
    }
    public Long getMemberid() {
        return memberid;
    }

    public void setMemberid(Long memberid) {
        this.memberid = memberid;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public Integer getRegisterDuration() {
        return registerDuration;
    }

    public void setRegisterDuration(Integer registerDuration) {
        this.registerDuration = registerDuration;
    }

    public Integer getWatchedMovieNum() {
        return watchedMovieNum;
    }

    public void setWatchedMovieNum(Integer watchedMovieNum) {
        this.watchedMovieNum = watchedMovieNum;
    }

    public Integer getDayNum() {
        return dayNum;
    }

    public void setDayNum(Integer dayNum) {
        this.dayNum = dayNum;
    }

    public Integer getNightNum() {
        return nightNum;
    }

    public void setNightNum(Integer nightNum) {
        this.nightNum = nightNum;
    }

    
    public Integer getMovieCost() {
		return movieCost;
	}
	public void setMovieCost(Integer movieCost) {
		this.movieCost = movieCost;
	}
	public Integer getSaveMoney() {
		return saveMoney;
	}
	public void setSaveMoney(Integer saveMoney) {
		this.saveMoney = saveMoney;
	}

    public Long getMostCinema() {
		return mostCinema;
	}
	public void setMostCinema(Long mostCinema) {
		this.mostCinema = mostCinema;
	}
	public Integer getCinemaMovieNum() {
        return cinemaMovieNum;
    }

    public void setCinemaMovieNum(Integer cinemaMovieNum) {
        this.cinemaMovieNum = cinemaMovieNum;
    }

    public Integer getMaxTogetherNum() {
        return maxTogetherNum;
    }

    public void setMaxTogetherNum(Integer maxTogetherNum) {
        this.maxTogetherNum = maxTogetherNum;
    }

    public Integer getAloneNum() {
        return aloneNum;
    }

    public void setAloneNum(Integer aloneNum) {
        this.aloneNum = aloneNum;
    }

    public Integer getTotalMarkNum() {
        return totalMarkNum;
    }

    public void setTotalMarkNum(Integer totalMarkNum) {
        this.totalMarkNum = totalMarkNum;
    }

    public Integer getLeFiveNum() {
        return leFiveNum;
    }

    public void setLeFiveNum(Integer leFiveNum) {
        this.leFiveNum = leFiveNum;
    }

    public Integer getGeEightNum() {
        return geEightNum;
    }

    public void setGeEightNum(Integer geEightNum) {
        this.geEightNum = geEightNum;
    }

    public Integer getGreatMovieNum() {
        return greatMovieNum;
    }

    public void setGreatMovieNum(Integer greatMovieNum) {
        this.greatMovieNum = greatMovieNum;
    }

    public String getGoodMovieIds() {
		return goodMovieIds;
	}
	public void setGoodMovieIds(String goodMovieIds) {
		this.goodMovieIds = goodMovieIds;
	}
	public String getBadMovieIds() {
		return badMovieIds;
	}
	public void setBadMovieIds(String badMovieIds) {
		this.badMovieIds = badMovieIds;
	}
	public String getMarkMovieIds() {
		return markMovieIds;
	}
	public void setMarkMovieIds(String markMovieIds) {
		this.markMovieIds = markMovieIds;
	}
	public Integer getTotalOrdersNum() {
        return totalOrdersNum;
    }

    public void setTotalOrdersNum(Integer totalOrdersNum) {
        this.totalOrdersNum = totalOrdersNum;
    }

    public Integer getWalaCount() {
        return walaCount;
    }

    public void setWalaCount(Integer walaCount) {
        this.walaCount = walaCount;
    }

    public Integer getBeFloweredCount() {
        return beFloweredCount;
    }

    public void setBeFloweredCount(Integer beFloweredCount) {
        this.beFloweredCount = beFloweredCount;
    }

    public Integer getBeReplyedCount() {
        return beReplyedCount;
    }

    public void setBeReplyedCount(Integer beReplyedCount) {
        this.beReplyedCount = beReplyedCount;
    }

    public Long getBestWalaID() {
        return bestWalaID;
    }

    public void setBestWalaID(Long bestWalaID) {
        this.bestWalaID = bestWalaID;
    }

    public Long getRecommendWalaID() {
        return recommendWalaID;
    }

    public void setRecommendWalaID(Long recommendWalaID) {
        this.recommendWalaID = recommendWalaID;
    }

    public Integer getFlowerCount() {
        return flowerCount;
    }

    public void setFlowerCount(Integer flowerCount) {
        this.flowerCount = flowerCount;
    }

    public Integer getReplyCount() {
        return replyCount;
    }

    public void setReplyCount(Integer replyCount) {
        this.replyCount = replyCount;
    }

    public Integer getFriendCount() {
        return friendCount;
    }

    public void setFriendCount(Integer friendCount) {
        this.friendCount = friendCount;
    }

    public Integer getRedPacketsNum() {
        return redPacketsNum;
    }

    public void setRedPacketsNum(Integer redPacketsNum) {
        this.redPacketsNum = redPacketsNum;
    }

    public Integer getTotalAnswerNum() {
        return totalAnswerNum;
    }

    public void setTotalAnswerNum(Integer totalAnswerNum) {
        this.totalAnswerNum = totalAnswerNum;
    }

    public Integer getRightAnswerNum() {
        return rightAnswerNum;
    }

    public void setRightAnswerNum(Integer rightAnswerNum) {
        this.rightAnswerNum = rightAnswerNum;
    }

    public Integer getWrongAnswerNum() {
        return wrongAnswerNum;
    }

    public void setWrongAnswerNum(Integer wrongAnswerNum) {
        this.wrongAnswerNum = wrongAnswerNum;
    }

    public Integer getJoinActivityNum() {
        return joinActivityNum;
    }

    public void setJoinActivityNum(Integer joinActivityNum) {
        this.joinActivityNum = joinActivityNum;
    }

    public String getHonorLabel() {
        return honorLabel;
    }

    public void setHonorLabel(String honorLabel) {
        this.honorLabel = honorLabel;
    }
	public String getRepeatMovies() {
		return repeatMovies;
	}
	public void setRepeatMovies(String repeatMovies) {
		this.repeatMovies = repeatMovies;
	}
	public String getTicketWalaCount() {
		return ticketWalaCount;
	}
	public void setTicketWalaCount(String ticketWalaCount) {
		this.ticketWalaCount = ticketWalaCount;
	}
	public Long getBestMovieId() {
		return bestMovieId;
	}
	public void setBestMovieId(Long bestMovieId) {
		this.bestMovieId = bestMovieId;
	}
	public Integer getCinemaUserCount() {
		return cinemaUserCount;
	}
	public void setCinemaUserCount(Integer cinemaUserCount) {
		this.cinemaUserCount = cinemaUserCount;
	}
	public String getUserMeetList() {
		return userMeetList;
	}
	public void setUserMeetList(String userMeetList) {
		this.userMeetList = userMeetList;
	}
}
