package com.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.pojo.Goods;

public interface GoodsService {
	
	//查询商品的总条数
		public int count(Integer typeNo,String goodsName);
		
		/**
		 * 查询所有的商品信息
		 * @param pageNo
		 * @param pageSize
		 * @param typeNo
		 * @param supplierNo
		 * @param goodsName
		 * @return
		 */
		public List<Goods> findAllGoods(Integer pageNo,Integer pageSize,Integer typeNo,String goodsName);
		

		/**
		 * 查询所有的商品价格信息
		 * @param pageNo
		 * @param pageSize
		 * @param typeNo
		 * @param supplierNo
		 * @param goodsName
		 * @return
		 */
		public List<Goods> getAllGoodsPrice(Integer pageNo,Integer pageSize,Integer typeNo,String goodsName);
		

		// 修改商品信息
		public boolean update(Integer goodsno,Integer typeno,
				Integer supplierno,String goodsname,String goodsunit
				,Double goodsoutprise,
				Double goodsinprise);
		
		//根据ID删除商品信息
		public boolean del(Integer goodsno);
		// 添加商品信息
		public boolean insert(Integer typeno,Integer supplierno,String goodsname,
								String goodsnorm,String goodsunit,Double goodsoutprise,Double goodsinprise);
	   

}
