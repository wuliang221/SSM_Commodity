package com.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.RequestParam;

import com.pojo.Goods;


public interface GoodsMapper {
	//查询商品的总条数
	public int count(@Param("typeNo")Integer typeNo,@Param("goodsName")String goodsName);
	
	 //* 查询所有的商品信息
	public List<Goods> getAllGoods(@Param("pageNo")Integer pageNo,@Param("pageSize")Integer pageSize,
									@Param("typeNo")Integer typeNo,@Param("goodsName")String goodsName);
   
	
	// 查询所有的商品价格信息
	public List<Goods> getAllGoodsPrice(@Param("pageNo")Integer pageNo,@Param("pageSize")Integer pageSize,
											@Param("typeNo")Integer typeNo,@Param("goodsName")String goodsName);
	
	 // 修改商品信息
	public int updateGoods(@Param("goodsno")Integer goodsno,@Param("typeno")Integer typeno,
							@Param("supplierno")Integer supplierno,@Param("goodsname")String goodsname,
							@Param("goodsunit")String goodsunit,@Param("goodsoutprise")Double goodsoutprise,
							@Param("goodsinprise")Double goodsinprise);
	
	// 根据ID删除商品信息
	public int delGoods(@Param("goodsno")Integer goodsno);
	// 添加商品信息
	public int insertGoods(@Param("typeno")Integer typeno,@Param("supplierno")Integer supplierno,
							@Param("goodsname")String goodsname,@Param("goodsnorm")String goodsnorm,
							@Param("goodsunit")String goodsunit,@Param("goodsoutprise")Double goodsoutprise,
							@Param("goodsinprise")Double goodsinprise);
}