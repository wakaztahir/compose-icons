package compose.icons.studioicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.OutlineGroup

public val OutlineGroup.SpaceDashboard: ImageVector
    get() {
        if (_spaceDashboard != null) {
            return _spaceDashboard!!
        }
        _spaceDashboard = Builder(name = "SpaceDashboard", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 3.0f)
                horizontalLineTo(5.0f)
                curveTo(3.9f, 3.0f, 3.0f, 3.9f, 3.0f, 5.0f)
                verticalLineToRelative(14.0f)
                curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(14.0f)
                curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f)
                verticalLineTo(5.0f)
                curveTo(21.0f, 3.9f, 20.1f, 3.0f, 19.0f, 3.0f)
                close()
                moveTo(5.0f, 19.0f)
                verticalLineTo(5.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(14.0f)
                horizontalLineTo(5.0f)
                close()
                moveTo(19.0f, 19.0f)
                horizontalLineToRelative(-6.0f)
                verticalLineToRelative(-7.0f)
                horizontalLineToRelative(6.0f)
                verticalLineTo(19.0f)
                close()
                moveTo(19.0f, 10.0f)
                horizontalLineToRelative(-6.0f)
                verticalLineTo(5.0f)
                horizontalLineToRelative(6.0f)
                verticalLineTo(10.0f)
                close()
            }
        }
        .build()
        return _spaceDashboard!!
    }

private var _spaceDashboard: ImageVector? = null