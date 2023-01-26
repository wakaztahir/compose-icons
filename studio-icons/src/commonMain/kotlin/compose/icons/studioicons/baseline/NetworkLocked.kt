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

public val BaselineGroup.NetworkLocked: ImageVector
    get() {
        if (_networkLocked != null) {
            return _networkLocked!!
        }
        _networkLocked = Builder(name = "NetworkLocked", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.5f, 10.0f)
                curveToRelative(0.17f, 0.0f, 0.33f, 0.03f, 0.5f, 0.05f)
                lineTo(20.0f, 1.0f)
                lineTo(1.0f, 20.0f)
                horizontalLineToRelative(13.0f)
                verticalLineToRelative(-3.0f)
                curveToRelative(0.0f, -0.89f, 0.39f, -1.68f, 1.0f, -2.23f)
                verticalLineToRelative(-0.27f)
                curveToRelative(0.0f, -2.48f, 2.02f, -4.5f, 4.5f, -4.5f)
                close()
                moveTo(22.0f, 16.0f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0.0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                reflectiveCurveTo(17.0f, 13.12f, 17.0f, 14.5f)
                lineTo(17.0f, 16.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f)
                verticalLineToRelative(4.0f)
                curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(5.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f)
                verticalLineToRelative(-4.0f)
                curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f)
                close()
                moveTo(21.0f, 16.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0.0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                lineTo(21.0f, 16.0f)
                close()
            }
        }
        .build()
        return _networkLocked!!
    }

private var _networkLocked: ImageVector? = null
