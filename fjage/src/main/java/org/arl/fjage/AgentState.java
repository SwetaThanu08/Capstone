/******************************************************************************

Copyright (c) 2013, Mandar Chitre

This file is part of fjage which is released under Simplified BSD License.
See file LICENSE.txt or go to http://www.opensource.org/licenses/BSD-3-Clause
for full license details.

******************************************************************************/

package org.arl.fjage;

/**
 * State of the agent.
 *
 * @author  Mandar Chitre
 */
public enum AgentState {

  /**
   * Unknown state.
   */
  NONE,

  /**
   * Agent is being initialized.
   */
  INIT,

  /**
   * Agent is idle, i.e., it is blocked or all its behaviors are blocked.
   */
  IDLE,

  /**
   * Agent has active behaviors and it is not blocked.
   */
  RUNNING,

  /**
   * Agent is terminating.
   */
  FINISHING,

  /**
   * Agent has terminated.
   */
  FINISHED

}

