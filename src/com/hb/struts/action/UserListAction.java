/*
 * Generated by MyEclipse Struts
 * Template path: templates/java/JavaClass.vtl
 */
package com.hb.struts.action;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.hb.services.UserService;

/** 
 * MyEclipse Struts
 * Creation date: 05-30-2016
 * 
 * XDoclet definition:
 * @struts.action
 */
public class UserListAction extends Action {
	/*
	 * Generated Methods
	 */

	/** 
	 * Method execute
	 * @param mapping
	 * @param form
	 * @param request
	 * @param response
	 * @return ActionForward
	 */
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		UserService userService = new UserService();
		ArrayList arrayList = userService.getUserList();
		request.setAttribute("userlists", arrayList);
		
		return mapping.findForward("toShowuserj");
	}
}