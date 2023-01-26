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

public val TwotoneGroup.OfflineShare: ImageVector
    get() {
        if (_offlineShare != null) {
            return _offlineShare!!
        }
        _offlineShare = Builder(name = "OfflineShare", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0f, 5.0f)
                horizontalLineTo(4.0f)
                verticalLineToRelative(16.0f)
                curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(10.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(5.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 1.0f)
                horizontalLineToRelative(-8.0f)
                curveTo(8.9f, 1.0f, 8.0f, 1.9f, 8.0f, 3.0f)
                verticalLineToRelative(14.0f)
                curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(8.0f)
                curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f)
                verticalLineTo(3.0f)
                curveTo(20.0f, 1.9f, 19.1f, 1.0f, 18.0f, 1.0f)
                close()
                moveTo(18.0f, 17.0f)
                horizontalLineToRelative(-8.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(8.0f)
                verticalLineTo(17.0f)
                close()
                moveTo(18.0f, 14.0f)
                horizontalLineToRelative(-8.0f)
                verticalLineTo(6.0f)
                horizontalLineToRelative(8.0f)
                verticalLineTo(14.0f)
                close()
                moveTo(18.0f, 4.0f)
                horizontalLineToRelative(-8.0f)
                verticalLineTo(3.0f)
                horizontalLineToRelative(8.0f)
                verticalLineTo(4.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.5f, 10.25f)
                horizontalLineToRelative(2.0f)
                verticalLineTo(12.0f)
                lineTo(17.0f, 9.5f)
                lineTo(14.5f, 7.0f)
                verticalLineToRelative(1.75f)
                horizontalLineTo(12.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f)
                verticalLineTo(12.0f)
                horizontalLineToRelative(1.5f)
                verticalLineTo(10.25f)
                close()
            }
        }
        .build()
        return _offlineShare!!
    }

private var _offlineShare: ImageVector? = null