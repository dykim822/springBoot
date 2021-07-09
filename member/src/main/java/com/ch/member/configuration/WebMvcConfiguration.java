package com.ch.member.configuration;
import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;

import com.ch.member.service.SessionChk;
@Configuration
public class WebMvcConfiguration {
	@Bean
	public CommonsMultipartResolver multipartResolver() {
		CommonsMultipartResolver cmr = new CommonsMultipartResolver();
		cmr.setDefaultEncoding("utf-8");
		cmr.setMaxUploadSizePerFile(10*1024*1024);	// 10MB까지
		return cmr;
	}
	// 어떤 것을 intercept 할 건지 지정해준다!
	public void addInterceptors(InterceptorRegistry ir) {
		List<String> URL_PATTERNS = 
				Arrays.asList("/**/main.do","/**/updateForm.do","/**/update.do",
						"/**/delete.do","/**/view.do");
		ir.addInterceptor(new SessionChk()).addPathPatterns(URL_PATTERNS);
//			.addPathPatterns("/**/main.do","/**/updateForm.do","/**/update.do",
//				"/**/delete.do","/**/view.do");
//			.excludePathPatterns("/**/joinForm.do","/**/join.do","/**/idChk.do"
//				,"/**/loginForm.do","/**/join.do")
//			.addPathPatterns("/**/*.do");

	}
}
