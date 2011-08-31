/*
 * ShiningPanda plug-in for Jenkins
 * Copyright (C) 2011 ShiningPanda S.A.S.
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 */
package jenkins.plugins.shiningpanda;

import hudson.Plugin;

import java.util.logging.Level;
import java.util.logging.Logger;

public class PythonPlugin extends Plugin
{

    private static final Logger LOGGER = Logger.getLogger(PythonPlugin.class.getName());

    /*
     * (non-Javadoc)
     * 
     * @see hudson.Plugin#start()
     */
    @Override
    public void start() throws Exception
    {
        LOGGER.log(Level.INFO, "Starting ShiningPanda Python plugin");
        super.start();
    }

    /*
     * (non-Javadoc)
     * 
     * @see hudson.Plugin#stop()
     */
    @Override
    public void stop() throws Exception
    {
        LOGGER.log(Level.INFO, "Stopping ShiningPanda Python plugin");
        super.stop();
    }
}