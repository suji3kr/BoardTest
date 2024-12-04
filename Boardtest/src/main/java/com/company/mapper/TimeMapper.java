package com.company.mapper;

import org.apache.ibatis.annotations.Select;
 

/*인터페이스에서 어노테이션 이용하면 바로 작성 가능하다. 그러나 긴 문장 작성이 불가능 하다.
  긴 문장을 작성 하고 싶으면 그보다 XML을 이용     -- Spring 에서 두가지 다 사용가능*/
public interface TimeMapper {
	
	@Select("SELECT sysdate FROM dual")
	public String getTime();
	
	/* XML 활용 */
	public String getTime2();
	
	

}
