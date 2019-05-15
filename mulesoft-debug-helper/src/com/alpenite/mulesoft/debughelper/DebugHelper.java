package com.alpenite.mulesoft.debughelper;

public class DebugHelper {

	public static void main(String[] args) {
		System.out.println(
				"\"\\\"You called the function 'Dynamic Selector' with these arguments: \n  1: Null (null)\n  2: Range ([0, 1])\n\nBut it expects one of these combinations:\n  (Array, Range)\n  (Array, Number)\n  (Array, Name)\n  (Array, String)\n  (Binary, Range)\n  (Binary, Number)\n  (Date, Name)\n  (DateTime, Name)\n  (LocalDateTime, Name)\n  (LocalTime, Name)\n  (Object, Name)\n  (Object, Number)\n  (Object, String)\n  (Period, Name)\n  (String, Range)\n  (String, Number)\n  (Time, Name)\n\n4| fun toTubeLang(language) = (language[0 to 1] ++ \\\"-\\\" ++ language[3 to 4])\n                               ^^^^^^^^^^^^^^^\nTrace:\n  at ++ (line: 4, column: 29)\n  at ++ (line: 4, column: 46)\n  at toTubeLang (line: 4, column: 53)\n  at flatten (line: 38, column: 27)\n  at flatten (line: 31, column: 37)\n  at main (line: 30, column: 46)\\\" evaluating expression: \\\"%dw 2.0\noutput application/json\nfun custom(customer, attrib) = ((customer.profile.'custom-attributes'.*'custom-attribute' filter((nv, nn) -> (nv.@'attribute-id' == attrib)))[0] default \\\"\\\")\nfun toTubeLang(language) = (language[0 to 1] ++ \\\"-\\\" ++ language[3 to 4])\n---\n{\n\\\"hdrs\\\": [\npayload.customers.*customer map (cust, c) -> flatten(\n  cust.*'wishlist' map (whis, i) -> {\n     \\\"customerNo\\\":cust.@'customer-no',\n     \\\"title\\\": cust.profile.'title',\n     \\\"firstName\\\": cust.profile.'first-name',\n     \\\"lastName\\\": cust.profile.'last-name',\n     \\\"email\\\": cust.profile.'email',\n     \\\"countryIso2Locale\\\": toTubeLang(cust.profile.'preferred-locale'),\n     \\\"customerId\\\": custom(cust, \\\"dynamicsCrmID\\\"),\n     \\\"marketing\\\": custom(cust, \\\"marketing\\\"),\n     \\\"marketingOptInDate\\\": custom(cust, \\\"marketingOptInDate\\\"),\n     \\\"marketingOptOutDate\\\": custom(cust, \\\"marketingOptOutDate\\\"),\n     \\\"profiling\\\": custom(cust, \\\"profiling\\\"),\n     \\\"profilingOptInDate\\\": custom(cust, \\\"profilingOptInDate\\\"),\n     \\\"profilingOptOutDate\\\": custom(cust, \\\"profilingOptOutDate\\\"),\n     \\\"wishlistid\\\": whis.'wishlist-id',\n     \\\"wishlistCreationDate\\\": whis.'wishlist-creation-date',\n     \\\"currency\\\": whis.'currency',\n  }\n)\n][0],\n\\\"rows\\\": [\npayload.customers.*customer map (cust, c) -> flatten(\n  cust.*'wishlist' map (wish, i) -> flatten(\n    wish.'product-lineitems'.*'product-lineitem' map (prod, j) -> {\n     \\\"customerNo\\\":cust.@'customer-no',\n     \\\"title\\\": cust.profile.'title',\n     \\\"firstName\\\": cust.profile.'first-name',\n     \\\"lastName\\\": cust.profile.'last-name',\n     \\\"email\\\": cust.profile.'email',\n     \\\"countryIso2Locale\\\": toTubeLang(cust.profile.'preferred-locale'),\n     \\\"customerId\\\": custom(cust, \\\"dynamicsCrmID\\\"),\n     \\\"marketing\\\": custom(cust, \\\"marketing\\\"),\n     \\\"marketingOptInDate\\\": custom(cust, \\\"marketingOptInDate\\\"),\n     \\\"marketingOptOutDate\\\": custom(cust, \\\"marketingOptOutDate\\\"),\n     \\\"profiling\\\": custom(cust, \\\"profiling\\\"),\n     \\\"profilingOptInDate\\\": custom(cust, \\\"profilingOptInDate\\\"),\n     \\\"profilingOptOutDate\\\": custom(cust, \\\"profilingOptOutDate\\\"),\n     \\\"wishlistid\\\": wish.'wishlist-id',\n     \\\"currency\\\": wish.'currency',\n     \\\"productId\\\": prod.'product-id',\n     \\\"PRODUCT_CODE\\\": (prod.'product-id'[0 to 19] default (prod.'product-id' default \\\"\\\")),\n     \\\"size\\\": prod.'size',\n     \\\"unitPrice\\\": prod.'unit-price',\n     \\\"qty\\\": prod.'quantity',\n     \\\"onlineStockQuantity\\\": prod.'online-stock-quantity',\n     \\\"lastRemainingNotification\\\": prod.'last-remaining-notification',\n  } \n )\n)\n][0][0],\n}\\\".\"");
	}

}