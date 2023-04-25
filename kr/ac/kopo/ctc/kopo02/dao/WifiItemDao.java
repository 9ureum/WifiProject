package kr.ac.kopo.ctc.kopo02.dao;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import kr.ac.kopo.ctc.kopo02.domain.WifiItem;

public class WifiItemDao {

	public List<WifiItem> selectAll() {
		List<WifiItem> ret = new ArrayList<WifiItem>();

		try {
			File kopo02_f = new File("c:\\Users\\kopo02\\무료와이파이new.txt"); // 파일 객체 생성 그리고 경로설정한 파일 불러옴
			BufferedReader kopo02_br = new BufferedReader(new FileReader(kopo02_f)); // buffered를 이용해 파일읽기 객체생성
			// 버퍼리더에 경로설정한 파일을을 넣어서 읽음

			String kopo02_readtxt; // String 변수선언

			if ((kopo02_readtxt = kopo02_br.readLine()) == null) { // 읽은 파일이 비어있으면
				System.out.printf("빈 파일입니다\n"); // 빈파일입니다 출력하고
				return ret; // 프로그램이 정상적으로 종료됨
			}
			//
			//			String[] kopo02_field_name = kopo02_readtxt.split("\t"); // kopo02_readtxt를 tap으로 나눠서
			//			// String 배열 kopo02_field_name에 넣는다

			//		double kopo02_lat =  // 위도
			//		double kopo02_lng = 127.1214038; // 경도

			while ((kopo02_readtxt = kopo02_br.readLine()) != null) { // 읽은 파일이 비어있지 않고 처음 파일과 같으면 while문이 실행된다
				WifiItem wifiItem = new WifiItem();
				String[] kopo02_field = kopo02_readtxt.split("\t");// kopo02_readtxt를 tap으로 나눠서
				wifiItem.setId(kopo02_field[0]);
				wifiItem.setInstallationLocationName(kopo02_field[1]);
				wifiItem.setInstallationLocationDetails(kopo02_field[2]);
				wifiItem.setInstallationCityName(kopo02_field[3]);
				wifiItem.setInstallationDistrictName(kopo02_field[4]);
				wifiItem.setInstallationFacilityType(kopo02_field[5]);
				wifiItem.setServiceProviderName(kopo02_field[6]);
				wifiItem.setWifiSsid(kopo02_field[7]);
				wifiItem.setDateOfInstallation(kopo02_field[8]);
				wifiItem.setRoadNameAddress(kopo02_field[9]);
				wifiItem.setLotNumberaddress(kopo02_field[10]);
				wifiItem.setManagementAgencyName(kopo02_field[11]);
				wifiItem.setManagementAgencyPhoneNumber(kopo02_field[12]);
				wifiItem.setLatitude(kopo02_field[13]);
				wifiItem.setLongitude(kopo02_field[14]);
				wifiItem.setCreated(kopo02_field[15]);

				ret.add(wifiItem);
			}
			kopo02_br.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return ret;
	}

}
