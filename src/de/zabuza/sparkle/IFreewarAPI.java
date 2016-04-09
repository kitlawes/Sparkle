package de.zabuza.sparkle;

import org.openqa.selenium.Capabilities;

import de.zabuza.sparkle.freewar.EWorld;
import de.zabuza.sparkle.freewar.IFreewarInstance;
import de.zabuza.sparkle.webdriver.EBrowser;

/**
 * Interface for APIs that allow playing the MMORPG <tt>Freewar</tt>.
 * 
 * @author Zabuza
 * 
 */
public interface IFreewarAPI {
	/**
	 * Gets the browser to use at logging in to accounts with
	 * {@link #login(String, String, EWorld)}. Once
	 * {@link #login(String, String, EWorld)} was used it will stick to the
	 * browser set at method call. By that multiple instances using different
	 * browsers can be created.
	 * 
	 * @return The current set browser
	 */
	public EBrowser getBrowser();

	/**
	 * Login to an account in <tt>Freewar</tt>. The API is capable of holding
	 * multiple {@link IFreewarInstance}s. If logging in different accounts of
	 * the same world, make sure to use different browsers. Else
	 * <tt>Freewar</tt> will automatically logout the first account. Set
	 * different browsers using {@link #setBrowser(EBrowser)} before login.
	 * 
	 * @param username
	 *            Username of the account
	 * @param password
	 *            Password of the account
	 * @param world
	 *            World the account is registered at
	 * @return Instance of the account after login
	 */
	public IFreewarInstance login(final String username, final String password, final EWorld world);

	/**
	 * Logs out from an account in <tt>Freewar</tt>. After logout the given
	 * instance is invalid and should not be used anymore.
	 * 
	 * @param instance
	 *            Instance to logout
	 */
	public void logout(final IFreewarInstance instance);

	/**
	 * Sets the browser to use at logging in to accounts with
	 * {@link #login(String, String, EWorld)}. Once
	 * {@link #login(String, String, EWorld)} was used it will stick to the
	 * browser set at method call. By that multiple instances using different
	 * browsers can be created.
	 * 
	 * @param browser
	 *            Browser to use
	 */
	public void setBrowser(final EBrowser browser);

	/**
	 * Sets the capabilities to use for browsers. Using this one can set for
	 * example browser profiles to use, or the path to the binary of the
	 * browser.
	 * 
	 * @param capabilities
	 *            The capabilities to set
	 */
	public void setCapabilities(final Capabilities capabilities);

	/**
	 * Shuts the API down, closing all remaining connections. This method does
	 * not necessarily logout from remaining {@link IFreewarInstance}s.
	 */
	public void shutdown();
}
