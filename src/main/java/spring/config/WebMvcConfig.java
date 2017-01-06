package spring.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
@EnableWebMvc							// Spring MVCが提供しているコンフィギュレーションクラスがインポートされる
@ComponentScan("spring.controller") 	// value属性に指定したパッケージの配下にあるステレオタイプアノテーションが付与されているクラスがスキャンされアプリケーションコンテキストにBean登録される
public class WebMvcConfig extends WebMvcConfigurerAdapter {

	@Override
	public void configureViewResolvers(ViewResolverRegistry registry) {
		// jspメソッドを呼び出しJSP用のViewResolverをセットアップする
		registry.jsp();
	}
	
	

}
