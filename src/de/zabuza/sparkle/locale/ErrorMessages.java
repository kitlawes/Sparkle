package de.zabuza.sparkle.locale;

import de.zabuza.sparkle.freewar.StayLoggedInService;
import de.zabuza.sparkle.freewar.inventory.ItemUtil;
import de.zabuza.sparkle.freewar.movement.network.NetworkUtil;
import de.zabuza.sparkle.webdriver.DelayedEventExecutor;

/**
 * Utility class that provides error messages for the API.
 * 
 * @author Zabuza {@literal <zabuza.dev@gmail.com>}
 * 
 */
public final class ErrorMessages {
	/**
	 * Thrown when an illegal coordinate was given that does not correspond to a
	 * blue sphere teleportation destination in {@link ItemUtil}.
	 */
	public static final String BLUE_SPHERE_COORDINATES_ILLEGAL = "The given coordinates do not correspond to a blue sphere teleportation destination.";
	/**
	 * Thrown when an illegal blue sphere teleportation destination was given
	 * that is not supported by the given method in {@link ItemUtil}.
	 */
	public static final String BLUE_SPHERE_DESTINATION_ILLEGAL = "The given blue sphere teleportation destination is not supported by this method.";
	/**
	 * Thrown when trying to get the move type of a given unsupported cost in
	 * {@link NetworkUtil}.
	 */
	public final static String COST_MOVE_TYPE_ILLEGAL = "The given cost is not supported by this method.";
	/**
	 * Thrown when a {@link DelayedEventExecutor} gets interrupted while
	 * sleeping.
	 */
	public static final String DELAYED_EVENT_EXECUTOR_INTERRUPTED = "The delayed event executor was interrupted while sleeping.";
	/**
	 * Thrown when trying to get the cost of a given unsupported move type in
	 * {@link NetworkUtil}.
	 */
	public final static String MOVE_TYPE_COST_ILLEGAL = "The given move type is not supported by this method.";
	/**
	 * Thrown when trying to execute the movement for a given unsupported move
	 * type in {@link NetworkUtil}.
	 */
	public final static String MOVE_TYPE_EXECUTION_ILLEGAL = "The given move type or situation is not supported by this method.";
	/**
	 * Thrown when a {@link StayLoggedInService} gets interrupted while
	 * sleeping.
	 */
	public static final String STAY_LOGGED_IN_SERVICE_INTERRUPTED = "The stay logged in service was interrupted while sleeping.";

	/**
	 * Utility class. No implementation.
	 */
	private ErrorMessages() {

	}
}
