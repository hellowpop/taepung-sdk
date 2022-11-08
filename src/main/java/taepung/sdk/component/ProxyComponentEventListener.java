package taepung.sdk.component;

public interface ProxyComponentEventListener {
	void event(ProxyComponent component,
	           ProxyComponentEvent eventType,
	           String eventContent);
}
