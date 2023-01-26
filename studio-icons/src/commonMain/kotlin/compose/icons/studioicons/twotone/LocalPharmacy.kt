package compose.icons.studioicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.TwotoneGroup

public val TwotoneGroup.LocalPharmacy: ImageVector
    get() {
        if (_localPharmacy != null) {
            return _localPharmacy!!
        }
        _localPharmacy = Builder(name = "LocalPharmacy", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.3f, strokeAlpha
                    = 0.3f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(5.11f, 19.0f)
                horizontalLineToRelative(13.78f)
                lineToRelative(-1.79f, -5.37f)
                lineToRelative(-0.21f, -0.63f)
                lineToRelative(0.21f, -0.63f)
                lineTo(18.89f, 7.0f)
                horizontalLineTo(5.11f)
                lineToRelative(1.79f, 5.37f)
                lineToRelative(0.21f, 0.63f)
                lineToRelative(-0.21f, 0.63f)
                lineTo(5.11f, 19.0f)
                close()
                moveTo(8.0f, 12.0f)
                horizontalLineToRelative(3.0f)
                verticalLineTo(9.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineTo(8.0f)
                verticalLineToRelative(-2.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 21.0f)
                horizontalLineToRelative(18.0f)
                verticalLineToRelative(-2.0f)
                lineToRelative(-2.0f, -6.0f)
                lineToRelative(2.0f, -6.0f)
                lineTo(21.0f, 5.0f)
                horizontalLineToRelative(-2.64f)
                lineToRelative(1.14f, -3.14f)
                lineTo(17.15f, 1.0f)
                lineToRelative(-1.46f, 4.0f)
                lineTo(3.0f, 5.0f)
                verticalLineToRelative(2.0f)
                lineToRelative(2.0f, 6.0f)
                lineToRelative(-2.0f, 6.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(6.9f, 12.37f)
                lineTo(5.11f, 7.0f)
                horizontalLineToRelative(13.78f)
                lineToRelative(-1.79f, 5.37f)
                lineToRelative(-0.21f, 0.63f)
                lineToRelative(0.21f, 0.63f)
                lineTo(18.89f, 19.0f)
                lineTo(5.11f, 19.0f)
                lineToRelative(1.79f, -5.37f)
                lineToRelative(0.21f, -0.63f)
                lineToRelative(-0.21f, -0.63f)
                close()
                moveTo(11.0f, 17.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-3.0f)
                lineTo(13.0f, 9.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(3.0f)
                lineTo(8.0f, 12.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(3.0f)
                close()
            }
        }
        .build()
        return _localPharmacy!!
    }

private var _localPharmacy: ImageVector? = null