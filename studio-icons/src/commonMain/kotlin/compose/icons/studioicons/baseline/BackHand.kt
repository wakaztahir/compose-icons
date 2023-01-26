package compose.icons.studioicons.baseline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.BaselineGroup

public val BaselineGroup.BackHand: ImageVector
    get() {
        if (_backHand != null) {
            return _backHand!!
        }
        _backHand = Builder(name = "BackHand", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 24.0f)
                curveToRelative(-3.26f, 0.0f, -6.19f, -1.99f, -7.4f, -5.02f)
                lineToRelative(-3.03f, -7.61f)
                curveTo(2.26f, 10.58f, 3.0f, 9.79f, 3.81f, 10.05f)
                lineToRelative(0.79f, 0.26f)
                curveToRelative(0.56f, 0.18f, 1.02f, 0.61f, 1.24f, 1.16f)
                lineTo(7.25f, 15.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(3.25f)
                curveTo(8.0f, 2.56f, 8.56f, 2.0f, 9.25f, 2.0f)
                reflectiveCurveToRelative(1.25f, 0.56f, 1.25f, 1.25f)
                verticalLineTo(12.0f)
                horizontalLineToRelative(1.0f)
                verticalLineTo(1.25f)
                curveTo(11.5f, 0.56f, 12.06f, 0.0f, 12.75f, 0.0f)
                reflectiveCurveTo(14.0f, 0.56f, 14.0f, 1.25f)
                verticalLineTo(12.0f)
                horizontalLineToRelative(1.0f)
                verticalLineTo(2.75f)
                curveToRelative(0.0f, -0.69f, 0.56f, -1.25f, 1.25f, -1.25f)
                curveToRelative(0.69f, 0.0f, 1.25f, 0.56f, 1.25f, 1.25f)
                verticalLineTo(12.0f)
                horizontalLineToRelative(1.0f)
                verticalLineTo(5.75f)
                curveToRelative(0.0f, -0.69f, 0.56f, -1.25f, 1.25f, -1.25f)
                reflectiveCurveTo(21.0f, 5.06f, 21.0f, 5.75f)
                verticalLineTo(16.0f)
                curveTo(21.0f, 20.42f, 17.42f, 24.0f, 13.0f, 24.0f)
                close()
            }
        }
        .build()
        return _backHand!!
    }

private var _backHand: ImageVector? = null
