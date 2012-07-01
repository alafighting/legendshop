/*
 * 
 * LegendShop 多用户商城系统
 * 
 *  版权所有,并保留所有权利。
 * 
 */
package com.legendshop.spi.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.legendshop.model.entity.ShopDetailView;

public interface BaseService {

	/**
	 * Gets the session attribute.
	 * 
	 * @param request
	 *            the request
	 * @param name
	 *            the name
	 * @return the session attribute
	 */
	public abstract Object getSessionAttribute(HttpServletRequest request, String name);

	/**
	 * Gets the shop name.
	 * 
	 * @param request
	 *            the request
	 * @param response
	 *            the response
	 * @return the shop name
	 */
	public abstract String getShopName(HttpServletRequest request, HttpServletResponse response);

	/**
	 * Sets the session attribute.
	 * 
	 * @param request
	 *            the request
	 * @param name
	 *            the name
	 * @param obj
	 *            the obj
	 */
	public abstract void setSessionAttribute(HttpServletRequest request, String name, Object obj);

	/**
	 * Sets the shop name.
	 * 
	 * @param request
	 *            the request
	 * @param response
	 *            the response
	 * @param shopName
	 *            the shop name
	 */
	public abstract void setShopName(HttpServletRequest request, HttpServletResponse response, String shopName);

	/**
	 * Convert string to integer.
	 * 
	 * @param id
	 *            the id
	 * @return the long
	 */
	public abstract Long convertStringToInteger(String id);
	
	/**
	 * Gets the shop detail view from session.
	 * 
	 * @param shopName
	 *            the shop name
	 * @param request
	 *            the request
	 * @param response
	 *            the response
	 * @return the shop detail view
	 */
	public abstract ShopDetailView getShopDetailView(String shopName, HttpServletRequest request,
			HttpServletResponse response);

}