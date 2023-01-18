package compose.icons.remixicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.RemixIcons

public val RemixIcons.UserSharedLine: ImageVector
    get() {
        if (_userSharedLine != null) {
            return _userSharedLine!!
        }
        _userSharedLine = Builder(name = "UserSharedLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 14.252f)
                verticalLineToRelative(2.09f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 6.0f, 22.0f)
                lineToRelative(-2.0f, -0.001f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 10.0f, -7.748f)
                close()
                moveTo(12.0f, 13.0f)
                curveToRelative(-3.315f, 0.0f, -6.0f, -2.685f, -6.0f, -6.0f)
                reflectiveCurveToRelative(2.685f, -6.0f, 6.0f, -6.0f)
                reflectiveCurveToRelative(6.0f, 2.685f, 6.0f, 6.0f)
                reflectiveCurveToRelative(-2.685f, 6.0f, -6.0f, 6.0f)
                close()
                moveTo(12.0f, 11.0f)
                curveToRelative(2.21f, 0.0f, 4.0f, -1.79f, 4.0f, -4.0f)
                reflectiveCurveToRelative(-1.79f, -4.0f, -4.0f, -4.0f)
                reflectiveCurveToRelative(-4.0f, 1.79f, -4.0f, 4.0f)
                reflectiveCurveToRelative(1.79f, 4.0f, 4.0f, 4.0f)
                close()
                moveTo(18.586f, 17.0f)
                lineToRelative(-1.829f, -1.828f)
                lineToRelative(1.415f, -1.415f)
                lineTo(22.414f, 18.0f)
                lineToRelative(-4.242f, 4.243f)
                lineToRelative(-1.415f, -1.415f)
                lineTo(18.586f, 19.0f)
                lineTo(15.0f, 19.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(3.586f)
                close()
            }
        }
        .build()
        return _userSharedLine!!
    }

private var _userSharedLine: ImageVector? = null