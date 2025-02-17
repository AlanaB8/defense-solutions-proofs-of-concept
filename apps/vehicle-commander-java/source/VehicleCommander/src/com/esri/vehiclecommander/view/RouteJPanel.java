/*******************************************************************************
 * Copyright 2012-2014 Esri
 * 
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 * 
 *  http://www.apache.org/licenses/LICENSE-2.0
 *  
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 ******************************************************************************/
package com.esri.vehiclecommander.view;

import com.esri.core.geometry.Point;
import com.esri.vehiclecommander.controller.MapController;
import com.esri.vehiclecommander.controller.RouteController;
import java.awt.Frame;
import java.awt.event.MouseEvent;
import java.util.HashMap;

/**
 * A form for routing and navigation.
 */
public class RouteJPanel extends RoundedJPanel {
    
    private static final HashMap<Object, Integer> presetToRange = new HashMap<Object, Integer>();
    static {
        presetToRange.put("Rifle", 800);
        presetToRange.put("Mortar", 2000);
        presetToRange.put("Artillery", 15000);
    }
    
    private final Frame app;
    private final MapController mapController;
    private final RouteController routeController;

    /**
     * Creates the route form but does not add it to the application.
     */
    public RouteJPanel(Frame app, MapController mapController, RouteController routeController) {
        initComponents();
        setSize(getPreferredSize());
        this.app = app;
        this.mapController = mapController;
        this.routeController = routeController;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel_title = new javax.swing.JLabel();
        jLabel_directions = new javax.swing.JLabel();
        jButton_close = new javax.swing.JButton();
        jToggleButton_draw = new javax.swing.JToggleButton();
        jButton_undo = new javax.swing.JButton();
        jButton_clear = new javax.swing.JButton();

        setOpaque(false);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                formComponentHidden(evt);
            }
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        jLabel_title.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel_title.setText("Route");

        jLabel_directions.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel_directions.setText("<html>Tap the map to add waypoints.<br/>Draw on the map to add routes.</html>");

        jButton_close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/esri/vehiclecommander/resources/X-Normal.png"))); // NOI18N
        jButton_close.setToolTipText("Close Panel");
        jButton_close.setBorderPainted(false);
        jButton_close.setContentAreaFilled(false);
        jButton_close.setFocusable(false);
        jButton_close.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jButton_close.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/com/esri/vehiclecommander/resources/X-Pressed.png"))); // NOI18N
        jButton_close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_closeActionPerformed(evt);
            }
        });

        jToggleButton_draw.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/esri/vehiclecommander/resources/RouteLine-Normal.png"))); // NOI18N
        jToggleButton_draw.setSelected(true);
        jToggleButton_draw.setToolTipText("Draw Route Lines");
        jToggleButton_draw.setBorderPainted(false);
        jToggleButton_draw.setContentAreaFilled(false);
        jToggleButton_draw.setFocusable(false);
        jToggleButton_draw.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jToggleButton_draw.setMaximumSize(new java.awt.Dimension(50, 50));
        jToggleButton_draw.setMinimumSize(new java.awt.Dimension(50, 50));
        jToggleButton_draw.setPreferredSize(new java.awt.Dimension(50, 50));
        jToggleButton_draw.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/com/esri/vehiclecommander/resources/RouteLine-Pressed.png"))); // NOI18N
        jToggleButton_draw.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/com/esri/vehiclecommander/resources/RouteLine-Pressed.png"))); // NOI18N
        jToggleButton_draw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton_drawActionPerformed(evt);
            }
        });

        jButton_undo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/esri/vehiclecommander/resources/Undo-Normal.png"))); // NOI18N
        jButton_undo.setToolTipText("Undo");
        jButton_undo.setBorderPainted(false);
        jButton_undo.setContentAreaFilled(false);
        jButton_undo.setFocusable(false);
        jButton_undo.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jButton_undo.setMaximumSize(new java.awt.Dimension(50, 50));
        jButton_undo.setMinimumSize(new java.awt.Dimension(50, 50));
        jButton_undo.setPreferredSize(new java.awt.Dimension(50, 50));
        jButton_undo.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/com/esri/vehiclecommander/resources/Undo-Pressed.png"))); // NOI18N
        jButton_undo.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/com/esri/vehiclecommander/resources/Undo-Pressed.png"))); // NOI18N
        jButton_undo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_undoActionPerformed(evt);
            }
        });

        jButton_clear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/esri/vehiclecommander/resources/Red-X-Normal.png"))); // NOI18N
        jButton_clear.setToolTipText("Clear Route");
        jButton_clear.setBorderPainted(false);
        jButton_clear.setContentAreaFilled(false);
        jButton_clear.setFocusable(false);
        jButton_clear.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jButton_clear.setMaximumSize(new java.awt.Dimension(50, 50));
        jButton_clear.setMinimumSize(new java.awt.Dimension(50, 50));
        jButton_clear.setPreferredSize(new java.awt.Dimension(50, 50));
        jButton_clear.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/com/esri/vehiclecommander/resources/Red-X-Pressed.png"))); // NOI18N
        jButton_clear.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/com/esri/vehiclecommander/resources/Red-X-Pressed.png"))); // NOI18N
        jButton_clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_clearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel_title)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton_close, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel_directions, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jButton_clear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton_undo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jToggleButton_draw, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_title)
                    .addComponent(jButton_close, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_directions, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jToggleButton_draw, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_undo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_clear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        setDrawEnabled(true);
    }//GEN-LAST:event_formComponentShown

    private void formComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentHidden
        setDrawEnabled(false);
    }//GEN-LAST:event_formComponentHidden

    private void jButton_closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_closeActionPerformed
        setVisible(false);
    }//GEN-LAST:event_jButton_closeActionPerformed

    private void jToggleButton_drawActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton_drawActionPerformed
        setDrawEnabled(jToggleButton_draw.isSelected());
    }//GEN-LAST:event_jToggleButton_drawActionPerformed

    private void jButton_clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_clearActionPerformed
        routeController.clear();
    }//GEN-LAST:event_jButton_clearActionPerformed

    private void jButton_undoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_undoActionPerformed
        routeController.undo();
    }//GEN-LAST:event_jButton_undoActionPerformed

    private void setDrawEnabled(boolean enabled) {
        if (enabled) {
            mapController.trackAsync(new MapOverlayAdapter() {
                
                private final Object mouseDownLock = new Object();
                private boolean mouseDown = false;

                @Override
                public void mouseClicked(MouseEvent event) {
                    Point point = mapController.toMapPointObject(event.getX(), event.getY());
                    routeController.addWaypoint(point);
                }

                @Override
                public void mouseDragged(MouseEvent event) {
                    synchronized (mouseDownLock) {
                        if (mouseDown) {
                            routeController.addPointToRouteLine(mapController.toMapPointObject(event.getX(), event.getY()));
                        }
                    }
                }

                @Override
                public void mousePressed(MouseEvent event) {
                    synchronized (mouseDownLock) {
                        mouseDown = true;
                    }
                }

                @Override
                public void mouseReleased(MouseEvent event) {
                    synchronized (mouseDownLock) {
                        mouseDown = false;
                        routeController.endRouteLine();
                    }
                }

            }, (short) (MapController.EVENT_MOUSE_CLICKED + MapController.EVENT_MOUSE_DRAGGED
                    + MapController.EVENT_MOUSE_PRESSED + MapController.EVENT_MOUSE_RELEASED));
        } else {
            mapController.cancelTrackAsync();
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_clear;
    private javax.swing.JButton jButton_close;
    private javax.swing.JButton jButton_undo;
    private javax.swing.JLabel jLabel_directions;
    private javax.swing.JLabel jLabel_title;
    private javax.swing.JToggleButton jToggleButton_draw;
    // End of variables declaration//GEN-END:variables
}
