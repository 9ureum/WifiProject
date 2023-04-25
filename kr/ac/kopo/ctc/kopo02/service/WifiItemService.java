package kr.ac.kopo.ctc.kopo02.service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import kr.ac.kopo.ctc.kopo02.dao.WifiItemDao;
import kr.ac.kopo.ctc.kopo02.domain.WifiItem;

public class WifiItemService {
	public double getDistance(WifiItem wifiItem1, WifiItem wifiItem2) throws IOException {
		WifiItemDao wifiItems = new WifiItemDao();
		List<Double> distanceList = new ArrayList<Double>();

		//거리 계산
		double distance = Math.sqrt(Math.pow(wifiItem1.getLatitudeToDouble() - wifiItem2.getLatitudeToDouble(), 2)//위도
				+ Math.pow(wifiItem1.getLongitudeToDouble() - wifiItem2.getLongitudeToDouble(),2));//경도

		//		double kopo02_dist = Math.sqrt( Math.pow(Double.parseDouble(kopo02_field[13]) -kopo02_lat, 2)
		//				+ Math.pow(Double.parseDouble(kopo02_field[14]) -kopo02_lng,2));


		return distance;



	}
}
