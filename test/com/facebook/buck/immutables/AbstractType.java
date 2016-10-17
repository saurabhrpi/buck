/*
 * Copyright 2015-present Facebook, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may
 * not use this file except in compliance with the License. You may obtain
 * a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */

package com.facebook.buck.immutables;

import com.facebook.buck.util.immutables.BuckStyleImmutable;

import org.immutables.value.Value;

import java.util.List;
import java.util.Optional;

/**
 * Interface from which a concrete immutable implementation {@link Type}
 * will be generated, along with an {@link Type.Builder}.
 */
@Value.Immutable
@BuckStyleImmutable
interface AbstractType {
  String getName();
  List<Long> getPhoneNumbers();
  Optional<String> getDescription();
}
