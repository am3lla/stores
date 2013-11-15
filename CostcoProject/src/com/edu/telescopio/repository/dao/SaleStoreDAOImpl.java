package com.edu.telescopio.repository.dao;

import java.util.LinkedHashMap;
import java.util.Map;

import com.edu.telescopio.repository.enums.SaleStoreEnum;
import com.edu.telescopio.repository.vo.SaleStore;

/**
 * @author andres
 *
 */
public class SaleStoreDAOImpl implements SaleStoreDAO {

	private static Map<String, SaleStore> map = new LinkedHashMap<String, SaleStore>();
	
	static {
		
		SaleStore ss = new SaleStore();
		String[] publicOpeningTime = {"9:00 A. M. - 9:00 P. M.", "9:00 A. M. - 8:00 P. M."};
		
		ss.setStoreName("Coapa");
		ss.setAddress("CALLE PUENTE 186, Col. AMSA TLALPAN, DF C.P. 14380");
		ss.setId(SaleStoreEnum.COAPA);
		ss.setWebSite("http://www.costco.com.mx/");
		ss.setEmail("http://www3.costco.com.mx/wps/portal/publico/CONTACTENOS");
		ss.setPhone("5556036571");
		ss.setPublicOpeningTime(publicOpeningTime);
			
		map.put(SaleStoreEnum.COAPA.toString(), ss);
		ss = new SaleStore();
		
		ss.setStoreName("Interlomas");
		ss.setAddress("BLVD. MAGNOCENTRO 4, Col. SAN FERNANDO LA HERRADURA HUIXQUILUCAN, EDO DE MEX C.P. 52760");
		ss.setId(SaleStoreEnum.INTERLOMAS);
		ss.setWebSite("http://www.costco.com.mx/");
		ss.setEmail("http://www3.costco.com.mx/wps/portal/publico/CONTACTENOS");
		ss.setPhone("5559500409");
		ss.setPublicOpeningTime(publicOpeningTime);
		
		map.put(SaleStoreEnum.INTERLOMAS.toString(), ss);
		ss = new SaleStore();		
		
		ss.setStoreName("Mixcoac");
		ss.setAddress("ADOLFO LOPEZ MATEOS 1181, Col. SAN PEDRO DE LOS PINOS ALVARO OBREGON,DF C.P. 1180");
		ss.setId(SaleStoreEnum.MIXCOAC);
		ss.setWebSite("http://www.costco.com.mx/");
		ss.setEmail("http://www3.costco.com.mx/wps/portal/publico/CONTACTENOS");
		ss.setPhone("5555163027");
		ss.setPublicOpeningTime(publicOpeningTime);
		
		map.put(SaleStoreEnum.MIXCOAC.toString(), ss);
		ss = new SaleStore();
		
		ss.setStoreName("Polanco");
		ss.setAddress("BLVD. MIGUEL DE C.SAAVEDRA 397, Col. IRRIGACION MIGUEL HIDALGO,DF C.P. 11500");
		ss.setId(SaleStoreEnum.POLANCO);
		ss.setWebSite("http://www.costco.com.mx/");
		ss.setEmail("http://www3.costco.com.mx/wps/portal/publico/CONTACTENOS");
		ss.setPhone("5521220271");
		ss.setPublicOpeningTime(publicOpeningTime);
		
		map.put(SaleStoreEnum.POLANCO.toString(), ss);
		ss = new SaleStore();
		
		ss.setStoreName("Satelite");
		ss.setAddress("CTO. CTRO.COMERCIAL 2001, Col. CD. SATELITE NAUCALPAN,EDO. DE MEX. C.P. 53100");
		ss.setId(SaleStoreEnum.SATELITE);
		ss.setWebSite("http://www.costco.com.mx/");
		ss.setEmail("http://www3.costco.com.mx/wps/portal/publico/CONTACTENOS");
		ss.setPhone("5553749940");
		ss.setPublicOpeningTime(publicOpeningTime);
		
		map.put(SaleStoreEnum.SATELITE.toString(), ss);
		ss = new SaleStore();
		
		ss.setStoreName("Arboledas");
		ss.setAddress("AV. SAN NICOLAS 10, Col. FRACC. SAN NICOLAS TLAXCOLPAN TLALNEPANTLA, EDO. MEX. C.P. 54030");
		ss.setId(SaleStoreEnum.ARBOLEDAS);
		ss.setWebSite("http://www.costco.com.mx/");
		ss.setEmail("http://www3.costco.com.mx/wps/portal/publico/CONTACTENOS");
		ss.setPhone("5553213280");
		ss.setPublicOpeningTime(publicOpeningTime);
		
		map.put(SaleStoreEnum.ARBOLEDAS.toString(), ss);		
		
	}
	
	private SaleStoreDAOImpl() {}
	
	private static class StaticHolder {
		
		public static final SaleStoreDAO INSTANCE= new SaleStoreDAOImpl();				
		
	}
	
	public static SaleStoreDAO getInstance() {
		
		return SaleStoreDAOImpl.StaticHolder.INSTANCE;
		
	}
	
	@Override
	public Map<String, SaleStore> getSaleStores() {
										
		return SaleStoreDAOImpl.map;
		
	}

}
