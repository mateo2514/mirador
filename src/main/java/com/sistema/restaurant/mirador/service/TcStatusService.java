package com.sistema.restaurant.mirador.service;

import java.util.List;

import com.sistema.restaurant.mirador.business.domain.TcStatus;

/**
 * @author Mateo
 *
 */
public interface TcStatusService {

	/**
	 * @param tcStatus
	 * @return
	 */
	List<TcStatus> save(TcStatus tcStatus);

	/**
	 * @param tcStatus
	 * @return
	 */
	List<TcStatus> update(TcStatus tcStatus);

	/**
	 * @param tcStatus
	 * @return
	 */
	List<TcStatus> delete(TcStatus tcStatus);

	/**
	 * @return
	 */
	TcStatus add();

	/**
	 * @return
	 */
	List<TcStatus> orderBy();

	/**
	 * @param tcStatus
	 * @return
	 */
	Boolean validateExist(TcStatus tcStatus);

	/**
	 * @param index
	 */
	void activeRowEdit(int index);

	/**
	 * @param list
	 * @return
	 */
	Integer getPage(List<TcStatus> list);

	/**
	 * @param describe
	 * @return
	 */
	List<TcStatus> findStatus(String describe);
}
