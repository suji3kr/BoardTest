package com.company.sample;

import org.springframework.stereotype.Component;
import lombok.Data;

@Component 				/* 하는 이유는 ? 스프링 컨테이너에 등록 /// or  @BEAN   -new() 를 쓰지 않아도됨  */
@Data		 /* toString이 자동적으로 생성되는 어노테이션 */
public class Chef {

}
