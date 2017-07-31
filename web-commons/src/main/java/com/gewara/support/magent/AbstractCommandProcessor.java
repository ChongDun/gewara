package com.gewara.support.magent;


public abstract class AbstractCommandProcessor implements CommandProcessor{
	protected String group;//����
	protected String name;
	protected String help;
	/**
	 * ��������
	 * @return
	 */
	@Override
	public String getName(){
		return name;
	}
	/**
	 * ������Ϣ
	 * @return
	 */
	@Override
	public String getHelp(){
		return help;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setHelp(String help) {
		this.help = help;
	}
	@Override
	public String getGroup() {
		return group;
	}
	public void setGroup(String group) {
		this.group = group;
	}
}
