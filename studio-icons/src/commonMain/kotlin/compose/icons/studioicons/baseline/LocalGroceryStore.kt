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

public val BaselineGroup.LocalGroceryStore: ImageVector
    get() {
        if (_localGroceryStore != null) {
            return _localGroceryStore!!
        }
        _localGroceryStore = Builder(name = "LocalGroceryStore", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.0f, 18.0f)
                curveToRelative(-1.1f, 0.0f, -1.99f, 0.9f, -1.99f, 2.0f)
                reflectiveCurveTo(5.9f, 22.0f, 7.0f, 22.0f)
                reflectiveCurveToRelative(2.0f, -0.9f, 2.0f, -2.0f)
                reflectiveCurveToRelative(-0.9f, -2.0f, -2.0f, -2.0f)
                close()
                moveTo(1.0f, 2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.0f)
                lineToRelative(3.6f, 7.59f)
                lineToRelative(-1.35f, 2.45f)
                curveToRelative(-0.16f, 0.28f, -0.25f, 0.61f, -0.25f, 0.96f)
                curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(12.0f)
                verticalLineToRelative(-2.0f)
                lineTo(7.42f, 15.0f)
                curveToRelative(-0.14f, 0.0f, -0.25f, -0.11f, -0.25f, -0.25f)
                lineToRelative(0.03f, -0.12f)
                lineToRelative(0.9f, -1.63f)
                horizontalLineToRelative(7.45f)
                curveToRelative(0.75f, 0.0f, 1.41f, -0.41f, 1.75f, -1.03f)
                lineToRelative(3.58f, -6.49f)
                curveToRelative(0.08f, -0.14f, 0.12f, -0.31f, 0.12f, -0.48f)
                curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f)
                lineTo(5.21f, 4.0f)
                lineToRelative(-0.94f, -2.0f)
                lineTo(1.0f, 2.0f)
                close()
                moveTo(17.0f, 18.0f)
                curveToRelative(-1.1f, 0.0f, -1.99f, 0.9f, -1.99f, 2.0f)
                reflectiveCurveToRelative(0.89f, 2.0f, 1.99f, 2.0f)
                reflectiveCurveToRelative(2.0f, -0.9f, 2.0f, -2.0f)
                reflectiveCurveToRelative(-0.9f, -2.0f, -2.0f, -2.0f)
                close()
            }
        }
        .build()
        return _localGroceryStore!!
    }

private var _localGroceryStore: ImageVector? = null
