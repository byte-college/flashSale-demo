package com.next.demo.flashSale;

public interface FlashSaleService {
	
	public FlashSaleResp check(FlashSaleReq req);

	default FlashSaleResp flash(FlashSaleReq req) {
		return new FlashSaleResp();
	}

}
