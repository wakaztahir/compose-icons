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

public val TablerIcons.AirBalloon: ImageVector
    get() {
        if (_airBalloon != null) {
            return _airBalloon!!
        }
        _airBalloon = Builder(name = "AirBalloon", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(11.0f, 19.0f)
                lineTo(13.0f, 19.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 14.0f, 20.0f)
                lineTo(14.0f, 21.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 13.0f, 22.0f)
                lineTo(11.0f, 22.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 10.0f, 21.0f)
                lineTo(10.0f, 20.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 11.0f, 19.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 16.0f)
                curveToRelative(3.314f, 0.0f, 6.0f, -4.686f, 6.0f, -8.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, false, -12.0f, 0.0f)
                curveToRelative(0.0f, 3.314f, 2.686f, 8.0f, 6.0f, 8.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.0f, 9.0f)
                arcToRelative(2.0f, 7.0f, 0.0f, true, false, 4.0f, 0.0f)
                arcToRelative(2.0f, 7.0f, 0.0f, true, false, -4.0f, 0.0f)
                close()
            }
        }
        .build()
        return _airBalloon!!
    }

private var _airBalloon: ImageVector? = null
