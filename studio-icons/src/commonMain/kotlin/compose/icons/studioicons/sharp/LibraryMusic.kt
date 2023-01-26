package compose.icons.studioicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.SharpGroup

public val SharpGroup.LibraryMusic: ImageVector
    get() {
        if (_libraryMusic != null) {
            return _libraryMusic!!
        }
        _libraryMusic = Builder(name = "LibraryMusic", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 2.0f)
                lineTo(6.0f, 2.0f)
                verticalLineToRelative(16.0f)
                horizontalLineToRelative(16.0f)
                lineTo(22.0f, 2.0f)
                close()
                moveTo(18.0f, 7.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(5.5f)
                curveToRelative(0.0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveTo(10.0f, 13.88f, 10.0f, 12.5f)
                reflectiveCurveToRelative(1.12f, -2.5f, 2.5f, -2.5f)
                curveToRelative(0.57f, 0.0f, 1.08f, 0.19f, 1.5f, 0.51f)
                lineTo(14.0f, 5.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(4.0f, 6.0f)
                lineTo(2.0f, 6.0f)
                verticalLineToRelative(16.0f)
                horizontalLineToRelative(16.0f)
                verticalLineToRelative(-2.0f)
                lineTo(4.0f, 20.0f)
                lineTo(4.0f, 6.0f)
                close()
            }
        }
        .build()
        return _libraryMusic!!
    }

private var _libraryMusic: ImageVector? = null