package taepung.sdk.component;

import io.netty.handler.codec.http.FullHttpRequest;
import io.netty.handler.codec.http.FullHttpResponse;

public interface HttpProxyComponent
		extends ProxyComponent {
	FullHttpResponse handle(FullHttpRequest request);
}
