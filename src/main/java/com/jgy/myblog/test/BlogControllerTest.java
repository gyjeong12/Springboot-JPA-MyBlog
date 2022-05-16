package com.jgy.myblog.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// Spring 이 com.jgy.myblog 페키지 이하를 스캔해서 모든 파일을 메모리에 new 하는 것이 아니라,
// 특정 annotation이 붙어 있는 class file들을 new 해서 (IoC) sprint container에 관리해 준다.
@RestController	
public class BlogControllerTest {

	//http://localhots:8080/test/hello
	@GetMapping("/test/hello")
	public String hello() {
		return "<h1>hello spring boot</h1>";
	}
}
