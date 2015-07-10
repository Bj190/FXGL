/*
 * The MIT License (MIT)
 *
 * FXGL - JavaFX Game Library
 *
 * Copyright (c) 2015 AlmasB (almaslvl@gmail.com)
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package com.almasb.fxgl.entity;

/**
 * Provides basic functionality of a control. The difference in usage between
 * AbstractControl and Control is that Control can be used if the control
 * doesn't require instance fields, i.e. static and state-less. If
 * instance level fields are needed and constant access to Entity is required
 * then use AbstractControl
 *
 * @author Almas Baimagambetov (AlmasB) (almaslvl@gmail.com)
 * @version 1.0
 *
 */
public abstract class AbstractControl implements Control {

    protected Entity entity;

    /**
     * Set entity for this control instance. This is called
     * by Entity during control attachment to entity
     *
     * @param entity
     */
    /* package-private */ void setEntity(Entity entity) {
        this.entity = entity;
        initEntity(entity);
    }

    /**
     * This is called during control attachment to
     * entity. Useful for setting properties required / used
     * by control
     *
     * @param entity
     */
    protected abstract void initEntity(Entity entity);
}
