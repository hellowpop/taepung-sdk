package taepung.sdk.component;

import java.util.Collection;
import java.util.Optional;

public interface ProxyComponentContainer {
	<T> Optional<T> lookup(Class<T> componentTYpe);

	Collection<ProxyComponent> components();

	void load(ProxyComponentEventListener listener);

	void unload();
}
