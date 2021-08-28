package org.mule.extension.people.management.internal;


/**
 * This class represents an extension connection just as example (there is no real connection with anything here c:).
 */
public final class PeoplemanagementConnection {

  private final String id;

  public PeoplemanagementConnection(String id) {
    this.id = id;
  }

  public String getId() {
    return id;
  }

  public void invalidate() {
    // do something to invalidate this connection!
  }
}
