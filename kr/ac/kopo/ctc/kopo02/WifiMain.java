package kr.ac.kopo.ctc.kopo02;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import kr.ac.kopo.ctc.kopo02.dao.WifiItemDao;
import kr.ac.kopo.ctc.kopo02.domain.WifiItem;
import kr.ac.kopo.ctc.kopo02.service.WifiItemService;

public class WifiMain {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		double min = Double.MAX_VALUE; // double형 변수로 값 넣어줌 maxvalue
		double max = Double.MIN_VALUE; // double형 변수로 값 넣어줌 minvalue
		WifiItem far = null;
		WifiItem close = null;


		WifiItemDao wifiItemDao = new WifiItemDao();
		List<WifiItem> wifiItems = wifiItemDao.selectAll();

		WifiItem wifiItem = new WifiItem();
		WifiItem me = new WifiItem();
		me.setLatitude("37.3860521");
		me.setLongitude("127.1214038");
		WifiItemService wifiItemService = new WifiItemService();

		for (WifiItem target : wifiItems) {
			double d = wifiItemService.getDistance(me, target);

			if ( d <= min ) {
				min = d;
				close = target;
			} 
			if ( d > max ) {
				max = d;
				far = target;
			}

		}

		System.out.printf("현재 지점과 가장 가까운 와이파이는 자료의 %s번째 와이파이\n설치 장소명 : %s\n도로명 주소 : %s\n최소거리(현재 지점과의 거리) : %s\n",close.getId(),close.getInstallationLocationName(),
				close.getRoadNameAddress(), min);

		System.out.printf("현재 지점과 가장 먼 와이파이는 자료의 %s번째 와이파이\n설치 장소명 : %s\n도로명 주소 : %s\n최대거리(현재 지점과의 거리 : %s\n",far.getId(),far.getInstallationLocationName(),
				far.getRoadNameAddress(), max);




		//		WifiItem me = new WifiItem();
		//		
		//		List<Double> distanceList = new ArrayList<Double>();
		//		for (WifiItem target : wifiItems) {
		//			double d = wifiItemService.getDistance(me, target);
		//			distanceList.add(d);
		//		}
		//		


	}
}
