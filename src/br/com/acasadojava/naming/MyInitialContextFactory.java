package br.com.acasadojava.naming;

import java.util.Hashtable;

import javax.naming.Binding;
import javax.naming.Context;
import javax.naming.Name;
import javax.naming.NameClassPair;
import javax.naming.NameParser;
import javax.naming.NamingEnumeration;
import javax.naming.NamingException;
import javax.naming.spi.InitialContextFactory;

public final class MyInitialContextFactory implements InitialContextFactory {

	private static final Context context = new Context() {

		private final Hashtable<String, Object> environment = new Hashtable<String, Object>();

		@Override
		public final Object addToEnvironment(final String propName, final Object propVal) throws NamingException {
			return null;
		}

		@Override
		public final void bind(final Name name, final Object obj) throws NamingException {
		}

		@Override
		public final void bind(final String name, final Object obj) throws NamingException {
			environment.put(name, obj);
		}

		@Override
		public final void close() throws NamingException {
		}

		@Override
		public final Name composeName(final Name name, final Name prefix) throws NamingException {
			return null;
		}

		@Override
		public final String composeName(final String name, final String prefix) throws NamingException {
			return null;
		}

		@Override
		public final Context createSubcontext(final Name name) throws NamingException {
			return null;
		}

		@Override
		public final Context createSubcontext(final String name) throws NamingException {
			return null;
		}

		@Override
		public final void destroySubcontext(final Name name) throws NamingException {
		}

		@Override
		public final void destroySubcontext(final String name) throws NamingException {
		}

		@Override
		public final Hashtable<?, ?> getEnvironment() throws NamingException {
			return null;
		}

		@Override
		public final String getNameInNamespace() throws NamingException {
			return null;
		}

		@Override
		public final NameParser getNameParser(final Name name) throws NamingException {
			return null;
		}

		@Override
		public final NameParser getNameParser(final String name) throws NamingException {
			return null;
		}

		@Override
		public final NamingEnumeration<NameClassPair> list(final Name name) throws NamingException {
			return null;
		}

		@Override
		public final NamingEnumeration<NameClassPair> list(final String name) throws NamingException {
			return null;
		}

		@Override
		public final NamingEnumeration<Binding> listBindings(final Name name) throws NamingException {
			return null;
		}

		@Override
		public final NamingEnumeration<Binding> listBindings(final String name) throws NamingException {
			return null;
		}

		@Override
		public final Object lookup(final Name name) throws NamingException {
			return null;
		}

		@Override
		public final Object lookup(final String name) throws NamingException {
			return environment.get(name);
		}

		@Override
		public final Object lookupLink(final Name name) throws NamingException {
			return null;
		}

		@Override
		public final Object lookupLink(final String name) throws NamingException {
			return null;
		}

		@Override
		public final void rebind(final Name name, final Object obj) throws NamingException {
		}

		@Override
		public final void rebind(final String name, final Object obj) throws NamingException {
		}

		@Override
		public final Object removeFromEnvironment(final String propName) throws NamingException {
			return null;
		}

		@Override
		public final void rename(final Name oldName, final Name newName) throws NamingException {
		}

		@Override
		public final void rename(final String oldName, final String newName) throws NamingException {
		}

		@Override
		public final void unbind(final Name name) throws NamingException {
		}

		@Override
		public final void unbind(final String name) throws NamingException {
		}

	};

	@Override
	public final Context getInitialContext(final Hashtable<?, ?> environment) throws NamingException {
		return context;
	}

}
