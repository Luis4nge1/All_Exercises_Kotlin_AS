/*
 * Copyright (C) 2023 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.woof.data

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.example.woof.R

data class Day(
    @StringRes val tittle: Int,
    @DrawableRes val imageResourceId: Int,
    @StringRes val name: Int
)


val days = listOf(
    Day(R.string.day_1,R.drawable.day1,R.string.day_description_1),
    Day(R.string.day_2,R.drawable.day2,R.string.day_description_2),
    Day(R.string.day_3,R.drawable.day3,R.string.day_description_3),
    Day(R.string.day_4,R.drawable.day4,R.string.day_description_4),
    Day(R.string.day_5,R.drawable.day5,R.string.day_description_5),
    Day(R.string.day_6,R.drawable.day6,R.string.day_description_6),
    Day(R.string.day_7,R.drawable.day7,R.string.day_description_7),
    Day(R.string.day_8,R.drawable.day8,R.string.day_description_8),
    Day(R.string.day_9,R.drawable.day9,R.string.day_description_9),
    Day(R.string.day_10,R.drawable.day10,R.string.day_description_10),
    Day(R.string.day_11,R.drawable.day11,R.string.day_description_11),
    Day(R.string.day_12,R.drawable.day12,R.string.day_description_12),
    Day(R.string.day_13,R.drawable.day13,R.string.day_description_13),
    Day(R.string.day_14,R.drawable.day14,R.string.day_description_14),
    Day(R.string.day_15,R.drawable.day15,R.string.day_description_15),
    Day(R.string.day_16,R.drawable.day16,R.string.day_description_16),
    Day(R.string.day_17,R.drawable.day17,R.string.day_description_17),
    Day(R.string.day_18,R.drawable.day18,R.string.day_description_18),
    Day(R.string.day_19,R.drawable.day19,R.string.day_description_19),
    Day(R.string.day_20,R.drawable.day20,R.string.day_description_20),
    Day(R.string.day_21,R.drawable.day21,R.string.day_description_21),
    Day(R.string.day_22,R.drawable.day22,R.string.day_description_22),
    Day(R.string.day_23,R.drawable.day23,R.string.day_description_23),
    Day(R.string.day_24,R.drawable.day24,R.string.day_description_24),
    Day(R.string.day_25,R.drawable.day25,R.string.day_description_25),
    Day(R.string.day_26,R.drawable.day26,R.string.day_description_26),
    Day(R.string.day_27,R.drawable.day27,R.string.day_description_27),
    Day(R.string.day_28,R.drawable.day28,R.string.day_description_28),
    Day(R.string.day_29,R.drawable.day29,R.string.day_description_29),
    Day(R.string.day_30,R.drawable.day30,R.string.day_description_30)
)

