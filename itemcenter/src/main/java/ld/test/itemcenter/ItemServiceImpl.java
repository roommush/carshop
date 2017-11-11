package ld.test.itemcenter;

import ld.test.itemcenterapi.Item;
import ld.test.itemcenterapi.ItemService;

/**
 * Alibaba Group EDAS. http://www.aliyun.com/product/edas
 */
public class ItemServiceImpl implements ItemService {

	@Override
	public Item getItemById(long id ) {
		Item car = new Item();
		car.setItemId( 1l );
		car.setItemName( "Mercedes Benz" );
		return car;
	}
	@Override
	public Item getItemByName( String name ) {
		Item car = new Item();
		car.setItemId( 2l );
		car.setItemName( "Mercedes Benz" );
		return car;
	}
}
