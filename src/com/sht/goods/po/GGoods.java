package com.sht.goods.po;

import java.io.File;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.sht.po.Goods;

/**
 * Title:CustomUsers
 * <p>
 * Description:自定义po;
 * <p>
 * @author Kor_Zhang
 * @date 2017年9月11日 下午4:45:49
 * @version 1.0
 */
@Component
@Scope("prototype")
public class GGoods extends Goods {
	private File[] files;
	
	private String path;
	
	private String headImg;
	
	private String addr;
	
	private String userId;
	
	
	private String msgNum;
	
	private int minLine;
	
	private int maxLine;
	
	private int rownum;
	
	public File[] getFiles() {
		return files;
	}

	public void setFiles(File[] files) {
		this.files = files;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public String getHeadImg() {
		return headImg;
	}

	public void setHeadImg(String headImg) {
		this.headImg = headImg;
	}

	public String getAddr() {
		return addr;
	}
	
	

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	

	public String getMsgNum() {
		return msgNum;
	}

	public void setMsgNum(String msgNum) {
		this.msgNum = msgNum;
	}

	public int getMinLine() {
		return minLine;
	}

	public void setMinLine(int minLine) {
		this.minLine = minLine;
	}

	public int getMaxLine() {
		return maxLine;
	}

	public void setMaxLine(int maxLine) {
		this.maxLine = maxLine;
	}

	public int getRownum() {
		return rownum;
	}

	public void setRownum(int rownum) {
		this.rownum = rownum;
	}

	
	
	
	

}
