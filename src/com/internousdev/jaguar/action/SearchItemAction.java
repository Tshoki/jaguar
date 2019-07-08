package com.internousdev.jaguar.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.jaguar.dao.MCategoryDAO;
import com.internousdev.jaguar.dao.ProductInfoDAO;
import com.internousdev.jaguar.dto.MCategoryDTO;
import com.internousdev.jaguar.dto.ProductInfoDTO;
import com.internousdev.jaguar.util.InputChecker;
import com.opensymphony.xwork2.ActionSupport;

public class SearchItemAction extends ActionSupport implements SessionAware{
	private int categoryId;
	private String keywords;
	private List<String> keywordsErrorMessageList;
	private List<ProductInfoDTO> productInfoDTOList;
	private Map<String , Object> session;

	public String execute() {
		if (categoryId == 0) {
			categoryId = 1;
		}

		InputChecker inputChecker = new InputChecker();

		if (StringUtils.isBlank(keywords)) {
			keywords = "";
		}else {
			keywords = keywords.replaceAll("　", " ").replaceAll("\\s{2,}"," ").trim();
		}

		if(!(keywords.equals(""))) {
			keywordsErrorMessageList = inputChecker.doCheck("検索ワード", keywords,0,50, true, true, true, true, true, true);

			if(keywordsErrorMessageList.size() > 0 ){
				return SUCCESS;
			}
		}

		ProductInfoDAO productInfoDAO = new ProductInfoDAO();
		switch (categoryId) {
		case 1:
			productInfoDTOList = productInfoDAO.getProductInfoListByKeyword(keywords.split(" "));
			break;

		default:
			productInfoDTOList = productInfoDAO.getProductInfoListByCategoryIdAndKeyword(keywords.split(" "), categoryId);
			break;
		}

		if(!session.containsKey("mCategoryDTOList")) {
			List<MCategoryDTO> mCategoryDTOList = new ArrayList<MCategoryDTO>();
			MCategoryDAO mCategoryDAO = new MCategoryDAO();
			try {
				mCategoryDTOList = mCategoryDAO.getMCategoryList();
			}catch (NullPointerException e) {
				mCategoryDTOList = null;
			}
			session.put("mCategoryDTOList", mCategoryDTOList);
		}
		return SUCCESS;
	}
	public int getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}
	public String getKeywords() {
		return keywords;
	}
	public void setKeywords(String keywords) {
		this.keywords = keywords;
	}
	public List<String> getKeywordsErrorMessageList(){
		return keywordsErrorMessageList;
	}
	public void setKeyowordsErrorMessageList(List<String> keywordsErrorMessageList) {
		this.keywordsErrorMessageList = keywordsErrorMessageList;
	}
	public List<ProductInfoDTO> getProductInfoDTOList(){
		return productInfoDTOList;
	}
	public void setProductInfoDTOList(List<ProductInfoDTO> productInfoDTOList) {
		this.productInfoDTOList = productInfoDTOList;
	}
	public Map<String, Object> getSession(){
		return session;
	}
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}
}
