package com.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.dao.GoodsMapper;
import com.pojo.Goods;
import com.service.GoodsService;
@Service
public class GoodsServiceImpl implements GoodsService {
	@Resource
	private GoodsMapper goodsMapper;
	/**
	 * 查询商品总数
	 */
	@Override
	public int count(Integer typeNo,String goodsName) {
		return goodsMapper.count(typeNo,goodsName);
	}
	/**
	 * 分页查询商品详细
	 */
	@Override
	public List<Goods> findAllGoods(Integer pageNo, Integer pageSize,
			Integer typeNo, String goodsName) {
		return goodsMapper.getAllGoods(pageNo,pageSize,typeNo,goodsName);
	}
	//判断商品是否修改成功
	@Override
	public boolean update(Integer goodsno,Integer typeno,
			Integer supplierno,String goodsname,String goodsunit,Double goodsoutprise,
			Double goodsinprise) {
		boolean result = false;
		int rs = goodsMapper.updateGoods(goodsno, typeno, supplierno, goodsname, 
											 goodsunit, goodsoutprise, goodsinprise);
		if(rs > 0){
			result = true;
		}
		return result;
	}
	//判断商品是否删除成功
	@Override
	public boolean del(Integer goodsno) {
		boolean result = false;
		int rs = goodsMapper.delGoods(goodsno);
		if(rs > 0){
			result = true;
		}
		return result;
	}
	//判断商品是否添加成功
	@Override
	public boolean insert(Integer typeno,
			Integer supplierno,String goodsname,
			String goodsnorm,String goodsunit,
			Double goodsoutprise,Double goodsinprise) {
		boolean result = false;
		int rs = goodsMapper.insertGoods(typeno, supplierno, goodsname, 
											goodsnorm, goodsunit, goodsoutprise, goodsinprise);
		if(rs>0){
			result = true;
		}
		return result;
	}
	//查询所有的商品价格
	@Override
	public List<Goods> getAllGoodsPrice(Integer pageNo,Integer pageSize,Integer typeNo,String goodsName) {
		return goodsMapper.getAllGoodsPrice(pageNo, pageSize, typeNo, goodsName);
	}

}
