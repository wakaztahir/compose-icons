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

public val BaselineGroup.RuleFolder: ImageVector
    get() {
        if (_ruleFolder != null) {
            return _ruleFolder!!
        }
        _ruleFolder = Builder(name = "RuleFolder", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 6.0f)
                horizontalLineToRelative(-8.0f)
                lineToRelative(-2.0f, -2.0f)
                horizontalLineTo(4.0f)
                curveTo(2.9f, 4.0f, 2.01f, 4.9f, 2.01f, 6.0f)
                lineTo(2.0f, 18.0f)
                curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(16.0f)
                curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f)
                verticalLineTo(8.0f)
                curveTo(22.0f, 6.9f, 21.1f, 6.0f, 20.0f, 6.0f)
                close()
                moveTo(7.83f, 16.0f)
                lineTo(5.0f, 13.17f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(3.54f, -3.54f)
                lineToRelative(1.41f, 1.41f)
                lineTo(7.83f, 16.0f)
                close()
                moveTo(17.41f, 13.0f)
                lineTo(19.0f, 14.59f)
                lineTo(17.59f, 16.0f)
                lineTo(16.0f, 14.41f)
                lineTo(14.41f, 16.0f)
                lineTo(13.0f, 14.59f)
                lineTo(14.59f, 13.0f)
                lineTo(13.0f, 11.41f)
                lineTo(14.41f, 10.0f)
                lineTo(16.0f, 11.59f)
                lineTo(17.59f, 10.0f)
                lineTo(19.0f, 11.41f)
                lineTo(17.41f, 13.0f)
                close()
            }
        }
        .build()
        return _ruleFolder!!
    }

private var _ruleFolder: ImageVector? = null
