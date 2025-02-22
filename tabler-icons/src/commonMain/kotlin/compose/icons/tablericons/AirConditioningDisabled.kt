package compose.icons.tablericons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.TablerIcons

public val TablerIcons.AirConditioningDisabled: ImageVector
    get() {
        if (_airConditioningDisabled != null) {
            return _airConditioningDisabled!!
        }
        _airConditioningDisabled = Builder(name = "AirConditioningDisabled", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(5.0f, 8.0f)
                lineTo(19.0f, 8.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 21.0f, 10.0f)
                lineTo(21.0f, 14.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 19.0f, 16.0f)
                lineTo(5.0f, 16.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 3.0f, 14.0f)
                lineTo(3.0f, 10.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 5.0f, 8.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(7.0f, 16.0f)
                verticalLineToRelative(-3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                horizontalLineToRelative(8.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
                verticalLineToRelative(3.0f)
            }
        }
        .build()
        return _airConditioningDisabled!!
    }

private var _airConditioningDisabled: ImageVector? = null
